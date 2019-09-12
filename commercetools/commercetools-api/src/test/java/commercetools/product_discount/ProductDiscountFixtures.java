package commercetools.product_discount;

import com.commercetools.models.ProductDiscount.ProductDiscount;
import com.commercetools.models.ProductDiscount.ProductDiscountDraft;
import com.commercetools.models.ProductDiscount.ProductDiscountDraftBuilder;
import com.commercetools.models.ProductDiscount.ProductDiscountValueExternalBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ProductDiscountFixtures {
    
    public static void withProductDiscount(final Consumer<ProductDiscount> consumer) {
        ProductDiscount productDiscount = createProductDiscount();
        consumer.accept(productDiscount);
        deleteProductDiscount(productDiscount.getId(), productDiscount.getVersion());
    }
    
    public static void withUpdateableProductDiscount(final UnaryOperator<ProductDiscount> operator) {
        ProductDiscount productDiscount = createProductDiscount();
        productDiscount = operator.apply(productDiscount);
        deleteProductDiscount(productDiscount.getId(), productDiscount.getVersion());
    }
    
    public static ProductDiscount createProductDiscount() {
        ProductDiscountDraft productDiscountDraft =  ProductDiscountDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .key(CommercetoolsTestUtils.randomKey())
                .sortOrder("0.3")
                .predicate("product.key=\"random-key\"")
                .value(ProductDiscountValueExternalBuilder.of().build())
                .isActive(false)
                .build();

        ProductDiscount productDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productDiscounts()
                .post(productDiscountDraft)
                .executeBlocking().getBody();

        Assertions.assertNotNull(productDiscount);
        Assertions.assertEquals(productDiscount.getKey(), productDiscountDraft.getKey());
        
        return productDiscount;
    }
    
    public static ProductDiscount deleteProductDiscount(final String id, final Long version) {
        ProductDiscount deletedProductDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productDiscounts()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();

        Assertions.assertNotNull(deletedProductDiscount);
        Assertions.assertEquals(deletedProductDiscount.getId(), id);
        
        return deletedProductDiscount;
    }
    
}
