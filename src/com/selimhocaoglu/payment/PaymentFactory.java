package com.selimhocaoglu.payment;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PaymentFactory {

    private static final String PACKAGE_NAME = "com.selimhocaoglu.payment";

    public List<PaymentMethod> discoverMethods() throws Exception {

        URL resource = Thread.currentThread()
                .getContextClassLoader()
                .getResource(PACKAGE_NAME.replace(".", "/"));

        List<PaymentMethod> methods = new ArrayList<>();

        for (File file : Objects.requireNonNull(new File(resource.toURI()).listFiles())) {
            if (!file.getName().endsWith(".class")) continue;

            String className = PACKAGE_NAME + "." + file.getName().replace(".class", "");
            Class<?> c = Class.forName(className);

            if (c.isInterface() || !PaymentMethod.class.isAssignableFrom(c)) continue;

            methods.add((PaymentMethod) c.getDeclaredConstructor().newInstance());
        }

        return methods;
    }
}