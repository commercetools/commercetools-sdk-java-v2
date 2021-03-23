
package commercetools.extension;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.extension.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class ExtensionFixtures {

    public static void withExtension(final Consumer<Extension> consumer) {
        Extension extension = createExtension();
        consumer.accept(extension);
        deleteExtension(extension.getId(), extension.getVersion());
    }

    public static void withUpdateableExtension(final UnaryOperator<Extension> operator) {
        Extension extension = createExtension();
        extension = operator.apply(extension);
        deleteExtension(extension.getId(), extension.getVersion());
    }

    public static Extension createExtension() {
        ExtensionDraft extensionDraft = ExtensionDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .destination(ExtensionHttpDestinationBuilder.of().url("http://www.commercetools.com").build())
                .triggers(Arrays.asList(ExtensionTriggerBuilder.of()
                        .resourceTypeId(ExtensionResourceTypeId.CART)
                        .actions(Arrays.asList(ExtensionAction.CREATE))
                        .build()))
                .build();

        Extension extension = CommercetoolsTestUtils.getProjectRoot()
                .extensions()
                .post(extensionDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(extension);
        Assert.assertEquals(extension.getKey(), extensionDraft.getKey());

        return extension;
    }

    public static Extension deleteExtension(final String id, final Long version) {
        Extension extension = CommercetoolsTestUtils.getProjectRoot()
                .extensions()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(extension);
        Assert.assertEquals(extension.getId(), id);

        return extension;
    }

}
