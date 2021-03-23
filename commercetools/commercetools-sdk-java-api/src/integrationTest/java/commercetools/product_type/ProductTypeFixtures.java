
package commercetools.product_type;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.product_type.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class ProductTypeFixtures {

    public static void withProductType(final Consumer<ProductType> consumer) {
        ProductType productType = createProductType();
        consumer.accept(productType);
        deleteProductType(productType.getId(), productType.getVersion());
    }

    public static void withUpdateableProductType(final UnaryOperator<ProductType> operator) {
        ProductType productType = createProductType();
        productType = operator.apply(productType);
        deleteProductType(productType.getId(), productType.getVersion());
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

        ProductType productType = CommercetoolsTestUtils.getProjectRoot()
                .productTypes()
                .post(productTypeDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(productType);
        Assert.assertEquals(productType.getName(), productTypeDraft.getName());
        Assert.assertEquals(productType.getDescription(), productTypeDraft.getDescription());

        return productType;
    }

    public static ProductType deleteProductType(final String id, final Long version) {
        ProductType deletedProductType = CommercetoolsTestUtils.getProjectRoot()
                .productTypes()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedProductType);
        Assert.assertEquals(deletedProductType.getId(), id);
        return deletedProductType;
    }

}
