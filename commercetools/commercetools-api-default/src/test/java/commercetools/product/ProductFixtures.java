package commercetools.product;

import com.commercetools.api.generated.models.product.Product;
import com.commercetools.api.generated.models.product.ProductDraft;
import com.commercetools.api.generated.models.product.ProductDraftBuilder;
import com.commercetools.api.generated.models.product_type.ProductType;
import com.commercetools.api.generated.models.product_type.ProductTypeResourceIdentifierBuilder;
import commercetools.product_type.ProductTypeFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ProductFixtures {
    
    public static void withProduct(final Consumer<Product> consumer) {
        ProductTypeFixtures.withProductType(productType -> {
            Product product = createProduct(productType);
            consumer.accept(product);
            deleteProductById(product.getId(), product.getVersion());
        });
    }
    
    public static void withUpdateableProduct(final UnaryOperator<Product> operator) {
        ProductTypeFixtures.withProductType(productType -> {
            Product product = createProduct(productType);
            product = operator.apply(product);
            deleteProductById(product.getId(), product.getVersion());
        });
    }
    
    public static Product createProduct(final ProductType productType) {
        ProductDraft productDraft = ProductDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .slug(CommercetoolsTestUtils.randomLocalizedString())
                .productType(ProductTypeResourceIdentifierBuilder.of()
                        .id(productType.getId())
                        .build())
                .build();
        
        Product product = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .products()
                .post(productDraft)
                .executeBlocking().getBody();
        Assert.assertNotNull(product);
        Assert.assertEquals(product.getKey(), productDraft.getKey());
        
        return product;
    }
    
    public static Product deleteProductById(final String id, final Long version) {
        Product product = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .products()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();
        Assert.assertNotNull(product);
        Assert.assertEquals(product.getId(), id);
        return product;
    }
    
    public static Product deleteProductByKey(final String key, final Long version) {
        Product product = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .products()
                .withKey(key)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();
        Assert.assertNotNull(product);
        Assert.assertEquals(product.getKey(), key);
        return product;
    }
    
}
