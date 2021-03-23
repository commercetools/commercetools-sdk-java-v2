
package commercetools.custom_object;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.custom_object.CustomObject;
import com.commercetools.api.models.custom_object.CustomObjectDraft;
import com.commercetools.api.models.custom_object.CustomObjectDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.utils.ValueObject;

import org.junit.Assert;

public class CustomObjectFixtures {

    public static void withCustomObject(final Consumer<CustomObject> consumer) {
        CustomObject customObject = createCustomObject();
        consumer.accept(customObject);
        deleteCustomObject(customObject.getContainer(), customObject.getKey(), customObject.getVersion());
    }

    public static void withUpdateableCustomObject(final UnaryOperator<CustomObject> operator) {
        CustomObject customObject = createCustomObject();
        customObject = operator.apply(customObject);
        deleteCustomObject(customObject.getContainer(), customObject.getKey(), customObject.getVersion());
    }

    public static CustomObject createCustomObject() {
        CustomObjectDraft customObjectDraft = CustomObjectDraftBuilder.of()
                .container("a")
                .key(CommercetoolsTestUtils.randomKey())
                .value((ValueObject) () -> "val")
                .build();

        CustomObject customObject = CommercetoolsTestUtils.getProjectRoot()
                .customObjects()
                .post(customObjectDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(customObject);

        return customObject;
    }

    public static CustomObject deleteCustomObject(final String container, final String key, final Long version) {
        CustomObject customObject = CommercetoolsTestUtils.getProjectRoot()
                .customObjects()
                .withContainerAndKey(container, key)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(customObject);
        return customObject;
    }
}
