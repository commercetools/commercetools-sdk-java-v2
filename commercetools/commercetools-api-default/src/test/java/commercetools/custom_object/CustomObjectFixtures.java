package commercetools.custom_object;

import com.commercetools.api.generated.models.custom_object.CustomObject;
import com.commercetools.api.generated.models.custom_object.CustomObjectDraft;
import com.commercetools.api.generated.models.custom_object.CustomObjectDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class CustomObjectFixtures {
    
    public static void withCustomObject(final Consumer<CustomObject> consumer) {
        CustomObject customObject = createCustomObject();
        consumer.accept(customObject);
        deleteCustomObject(customObject.getId(), customObject.getVersion());
    }
    
    public static void withUpdateableCustomObject(final UnaryOperator<CustomObject> operator) {
        CustomObject customObject = createCustomObject();
        customObject = operator.apply(customObject);
        deleteCustomObject(customObject.getId(), customObject.getVersion());
    }
    
    public static CustomObject createCustomObject() {
        CustomObjectDraft customObjectDraft = CustomObjectDraftBuilder.of()
                .container("a")
                .key(CommercetoolsTestUtils.randomKey())
                .value(CommercetoolsTestUtils.randomString())
                .build();
        
        CustomObject customObject = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .customObjects()
                .post(customObjectDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(customObject);
        
        return customObject;
    }
    
    public static CustomObject deleteCustomObject(final String id, final Long version) {
        CustomObject customObject = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .customObjects()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(customObject);
        return customObject;
    }
}
