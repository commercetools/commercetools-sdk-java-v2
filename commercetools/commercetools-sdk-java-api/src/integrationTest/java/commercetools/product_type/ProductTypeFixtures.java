
package commercetools.product_type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product_type.*;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.error.NotFoundException;

import org.junit.jupiter.api.Assertions;

public class ProductTypeFixtures {

    public static ProductType defaultProductType(final ProjectApiRoot client) {
        final String name = "referenceable-product-1";
        return createProductType(client, name);
    }

    public static ProductType createProductType(final ProjectApiRoot client, final String name) {
        final ProductTypeDraft productTypeDraft = ProductTypeDraft.builder()
                .key(CommercetoolsTestUtils.randomKey())
                .name(name)
                .description("")
                .attributes(new ArrayList<>())
                .build();
        return client.productTypes()
                .get()
                .addQuery(q -> q.name().is(name))
                .executeBlocking()
                .getBody()
                .head()
                .orElseGet(() -> client.productTypes().create(productTypeDraft).executeBlocking().getBody());
    }

    public static void withProductType(final ProductTypeDraft productTypeDraft, final Consumer<ProductType> consumer) {
        ProductType productType = createProductType(productTypeDraft);
        try {
            consumer.accept(productType);
        }
        finally {
            deleteProductType(productType.getId(), productType.getVersion());
        }
    }

    public static void withProductType(final Consumer<ProductType> consumer) {
        ProductType productType = createProductType();
        try {
            consumer.accept(productType);
        }
        finally {
            deleteProductType(productType.getId(), productType.getVersion());
        }
    }

    public static void withUpdateableProductType(final UnaryOperator<ProductType> operator) {
        ProductType productType = createProductType();
        try {
            productType = operator.apply(productType);
        }
        finally {
            deleteProductType(productType.getId(), productType.getVersion());
        }
    }

    public static ProductType createProductType() {

        AttributeDefinitionDraft attributeDefinitionDraft = AttributeDefinitionDraftBuilder.of()
                .type(AttributeTextTypeBuilder.of().build())
                .name(CommercetoolsTestUtils.randomString())
                .label(CommercetoolsTestUtils.randomLocalizedString())
                .isRequired(true)
                .attributeConstraint(AttributeConstraintEnum.NONE)
                .inputTip(CommercetoolsTestUtils.randomLocalizedString())
                .inputHint(TextInputHint.SINGLE_LINE)
                .isSearchable(true)
                .build();

        ProductTypeDraft productTypeDraft = ProductTypeDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .name(CommercetoolsTestUtils.randomString())
                .description(CommercetoolsTestUtils.randomString())
                .attributes(Arrays.asList(attributeDefinitionDraft))
                .build();

        return createProductType(productTypeDraft);
    }

    public static ProductType createProductType(ProductTypeDraft productTypeDraft) {
        ProductType productType = CommercetoolsTestUtils.getProjectApiRoot()
                .productTypes()
                .post(productTypeDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(productType);
        Assertions.assertEquals(productType.getName(), productTypeDraft.getName());
        Assertions.assertEquals(productType.getDescription(), productTypeDraft.getDescription());

        return productType;
    }

    public static ProductType deleteProductType(final String id, final Long version) {
        ProductType deletedProductType = null;
        try {
            deletedProductType = CommercetoolsTestUtils.getProjectApiRoot()
                    .productTypes()
                    .withId(id)
                    .delete()
                    .withVersion(version)
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(deletedProductType);
            Assertions.assertEquals(deletedProductType.getId(), id);
        }
        catch (NotFoundException ignored) {
        }
        return deletedProductType;
    }

}
