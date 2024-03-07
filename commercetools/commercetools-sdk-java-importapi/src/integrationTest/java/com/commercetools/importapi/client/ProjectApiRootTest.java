
package com.commercetools.importapi.client;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

public class ProjectApiRootTest {

    private static final List<String> ignoreMethods = Lists.newArrayList();

    /**
     * Retrieves all public methods of the {@link ProjectScopedApiRoot} and the public methods of the {@link ByProjectKeyRequestBuilder} and
     * checks if project request builder methods are present in ProjectApiRoot methods
     */
    @Test
    public void allSubResourcesSupported() {

        final List<String> projectApiRootMethods = Lists.newArrayList(ProjectScopedApiRoot.class.getDeclaredMethods())
                .stream()
                .filter(method -> Modifier.isPublic(method.getModifiers()))
                .map(Method::getName)
                .distinct()
                .collect(Collectors.toList());

        final List<String> resourceMethods = Lists.newArrayList(ByProjectKeyRequestBuilder.class.getDeclaredMethods())
                .stream()
                .filter(method -> Modifier.isPublic(method.getModifiers()))
                .map(Method::getName)
                .filter(methodName -> !ignoreMethods.contains(methodName))
                .filter(methodName -> !projectApiRootMethods.contains(methodName))
                .collect(Collectors.toList());

        Assertions.assertThat(resourceMethods)
                .withFailMessage("missing endpoints in ProjectApiRoot: %s", resourceMethods)
                .isEmpty();
    }
}
