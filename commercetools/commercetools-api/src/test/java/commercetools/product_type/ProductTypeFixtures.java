package commercetools.product_type;

import com.commercetools.models.product_type.ProductType;
import com.commercetools.models.product_type.ProductTypeDraft;
import com.commercetools.models.product_type.ProductTypeDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ProductTypeFixtures {
    
    public static void withProductType(final Consumer<ProductType> consumer){
        ProductType productType = createProductType();
        consumer.accept(productType);
        deleteProductType(productType.getId(), productType.getVersion());
    }
    
    public static void withUpdateableProductType(final UnaryOperator<ProductType> operator){
        ProductType productType = createProductType();
        productType = operator.apply(productType);
        deleteProductType(productType.getId(), productType.getVersion());
    }
    
    public static ProductType createProductType() {
        ProductTypeDraft productTypeDraft = ProductTypeDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .name(CommercetoolsTestUtils.randomString())
                .description(CommercetoolsTestUtils.randomString())
                .build();

        ProductType productType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productTypes()
                .post(productTypeDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(productType);
        Assert.assertEquals(productType.getName(), productTypeDraft.getName());
        Assert.assertEquals(productType.getDescription(), productTypeDraft.getDescription());
        
        return productType;
    }
    
    public static ProductType deleteProductType(final String id, final Long version) {
        ProductType deletedProductType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productTypes()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(deletedProductType);
        Assert.assertEquals(deletedProductType.getId(), id);
        return deletedProductType;
    }
    
}
