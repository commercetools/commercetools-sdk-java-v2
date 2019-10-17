package cleanup;

import com.commercetools.api.generated.models.cart_discount.CartDiscountPagedQueryResponse;
import com.commercetools.api.generated.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.generated.models.discount_code.DiscountCodePagedQueryResponse;
import com.commercetools.api.generated.models.inventory.InventoryPagedQueryResponse;
import com.commercetools.api.generated.models.product.ProductPagedQueryResponse;
import com.commercetools.api.generated.models.product_discount.ProductDiscountPagedQueryResponse;
import com.commercetools.api.generated.models.product_type.ProductTypePagedQueryResponse;
import com.commercetools.api.generated.models.review.ReviewPagedQueryResponse;
import com.commercetools.api.generated.models.tax_category.TaxCategoryPagedQueryResponse;
import commercetools.cart_discount.CartDiscountFixtures;
import commercetools.category.CategoryFixtures;
import commercetools.discount_code.DiscountCodeFixtures;
import commercetools.inventory.InventoryEntryFixtures;
import commercetools.product.ProductFixtures;
import commercetools.product_discount.ProductDiscountFixtures;
import commercetools.product_type.ProductTypeFixtures;
import commercetools.review.ReviewFixtures;
import commercetools.tax_category.TaxCategoryFixtures;
import commercetools.utils.CommercetoolsTestUtils;

/**
 * Please be careful when running these tests, as they are meant to be used as cleanup and will delete all resources in your project
 */
public class DeleteEverythingIntegrationTest {

    //@Test
    public void deleteAllCategories() {
        CategoryPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .categories()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(category -> {
                CategoryFixtures.deleteCategory(category.getId(), category.getVersion());
            });
        } while (response.getResults().size() != 0);
    }

    //@Test
    public void deleteAllCartDiscounts() {
        CartDiscountPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .cartDiscounts()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(cartDiscount -> {
                CartDiscountFixtures.deleteCartDiscount(cartDiscount.getId(), cartDiscount.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    //@Test
    public void deleteAllInventories() {
        InventoryPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .inventory()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(inventory -> {
                InventoryEntryFixtures.delete(inventory.getId());
            });
        } while (response.getResults().size() != 0);
    }
    
    //@Test
    public void deleteAllProducts() {
        ProductPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .products()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(product -> {
                ProductFixtures.deleteProductById(product.getId(), product.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    //@Test
    public void deleteAllProductDiscounts() {
        ProductDiscountPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productDiscounts()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(productDiscount -> {
                ProductDiscountFixtures.deleteProductDiscount(productDiscount.getId(), productDiscount.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    //@Test
    public void deleteAllProductTypes() {
        ProductTypePagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productTypes()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(productType -> {
                ProductTypeFixtures.deleteProductType(productType.getId(), productType.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    //@Test
    public void deleteAllReviews() {
        ReviewPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .reviews()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(review -> {
                ReviewFixtures.delete(review.getId(), review.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    //@Test
    public void deleteAllTaxCategories() {
        TaxCategoryPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .taxCategories()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(taxCategory -> {
                TaxCategoryFixtures.deleteTaxCategory(taxCategory.getId(), taxCategory.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    //@Test
    public void deleteAllDiscountCodes() {
        DiscountCodePagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .discountCodes()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(discountCode -> {
                DiscountCodeFixtures.deleteDiscountCode(discountCode.getId(), discountCode.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
}
