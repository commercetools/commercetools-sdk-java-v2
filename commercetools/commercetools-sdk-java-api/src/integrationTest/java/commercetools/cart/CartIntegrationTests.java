
package commercetools.cart;

import static commercetools.cart.CartsFixtures.createCart;
import static commercetools.cart.CartsFixtures.deleteCart;
import static commercetools.category.CategoryFixtures.withCategory;
import static commercetools.product.ProductFixtures.*;
import static commercetools.product_type.ProductTypeFixtures.withProductType;
import static commercetools.tax_category.TaxCategoryFixtures.withTaxCategory;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart.CartDraftBuilder;
import com.commercetools.api.models.product.Product;
import commercetools.product.ProductFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartIntegrationTests {
    @Test
    public void queryByCustomerId() {
        CartsFixtures.withCartWithCustomer((cart, customer) -> {
            Cart queriedCart = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .get()
                    .withWhere("customerId = \"" + customer.getId() + "\" and cartState = \"Active\"")
                    .executeBlocking()
                    .getBody()
                    .getResults()
                    .get(0);
            Assertions.assertThat(queriedCart.getId()).isEqualTo(cart.getId());

            Cart queriedCart2 = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .get()
                    .withWhere("customerId = :customerId and cartState = \"Active\"")
                    .withPredicateVar("customerId", customer.getId())
                    .executeBlocking()
                    .getBody()
                    .getResults()
                    .get(0);
            Assertions.assertThat(queriedCart2.getId()).isEqualTo(cart.getId());
        });
    }

    @Test
    public void queryByCustomerIdFailed() {
        CartsFixtures.withCartWithCustomer((cart, customer) -> {
            List<Cart> queriedCart = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .get()
                    .withWhere("customerId = \"40c4e90e-0666-499c-b645-c6b0a1e7d190\" and cartState = \"Active\"")
                    .executeBlocking()
                    .getBody()
                    .getResults();
            Assertions.assertThat(queriedCart).isEmpty();

            List<Cart> queriedCart2 = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .get()
                    .withWhere("customerId = :customerId and cartState = \"Active\"")
                    .withPredicateVar("customerId", "40c4e90e-0666-499c-b645-c6b0a1e7d190")
                    .executeBlocking()
                    .getBody()
                    .getResults();
            Assertions.assertThat(queriedCart2).isEmpty();
        });
    }

    @Test
    public void getByCustomerId() {
        CartsFixtures.withCartWithCustomer((cart, customer) -> {
            Cart queriedCart = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .withCustomerId(customer.getId())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assertions.assertThat(queriedCart.getId()).isEqualTo(cart.getId());
        });
    }

    @Test
    public void bigCart() {
        withTaxCategory(
            taxCategory -> withCategory(category -> withProductType(createProductTypeDraft(), productType -> {
                List<Product> products = new ArrayList<>();
                for (int i = 0; i < 100; i++) {
                    products.add(createProduct(productType, category, taxCategory, true));
                }

                CartDraftBuilder cartDraft = CartDraft.builder().currency("EUR").country("DE");
                products.forEach(product -> cartDraft.plusLineItems(lineItemDraftBuilder -> lineItemDraftBuilder
                        .sku(product.getMasterData().getCurrent().getMasterVariant().getSku())));

                try {
                    final long startTime = System.currentTimeMillis();
                    Cart cart = createCart(cartDraft.build());
                    final long executionTime = System.currentTimeMillis() - startTime;
                    deleteCart(cart.getId(), cart.getVersion());
                }
                finally {
                    products.forEach(ProductFixtures::deleteProduct);
                }
            })));
    }

}
