
package commercetools.custom_object;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.custom_object.CustomObject;
import com.commercetools.api.models.custom_object.CustomObjectDraft;
import com.commercetools.api.models.custom_object.CustomObjectDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.utils.ValueObject;

import org.junit.jupiter.api.Assertions;

public class CustomObjectFixtures {

    public static void withCustomObject(final Consumer<CustomObject> consumer) {
        CustomObject customObject = createCustomObject();
        try {
            consumer.accept(customObject);
        }
        finally {
            deleteCustomObject(customObject.getContainer(), customObject.getKey(), customObject.getVersion());
        }
    }

    public static void withUpdateableCustomObject(final UnaryOperator<CustomObject> operator) {
        CustomObject customObject = createCustomObject();
        try {
            customObject = operator.apply(customObject);
        }
        finally {
            deleteCustomObject(customObject.getContainer(), customObject.getKey(), customObject.getVersion());
        }
    }

    public static CustomObject createCustomObject() {
        CustomObjectDraft customObjectDraft = CustomObjectDraftBuilder.of()
                .container("a")
                .key(CommercetoolsTestUtils.randomKey())
                .value((ValueObject) () -> "val")
                .build();

        CustomObject customObject = CommercetoolsTestUtils.getProjectApiRoot()
                .customObjects()
                .post(customObjectDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(customObject);

        return customObject;
    }

    public static CustomObject deleteCustomObject(final String container, final String key, final Long version) {
        CustomObject customObject = CommercetoolsTestUtils.getProjectApiRoot()
                .customObjects()
                .withContainerAndKey(container, key)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(customObject);
        return customObject;
    }
}
