
package commercetools;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.stream.Collectors;

import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.client.ProjectApiRoot;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

public class ProjectApiRootTest {

    private static final List<String> ignoreMethods = Lists.newArrayList("inStoreKeyWithStoreKeyValue",
        "inBusinessUnitKeyWithBusinessUnitKeyValue");

    /**
     * Retrieves all public methods of the {@link ProjectApiRoot} and the public methods of the {@link ByProjectKeyRequestBuilder} and
     * checks if project request builder methods are present in ProjectApiRoot methods
     */
    @Test
    public void allSubResourcesSupported() {

        final List<String> projectApiRootMethods = Lists.newArrayList(ProjectApiRoot.class.getDeclaredMethods())
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

        Assertions.assertThat(resourceMethods).isEmpty();
    }
}
