
package commercetools.cart;

import static commercetools.cart.CartsFixtures.createCart;
import static commercetools.cart.CartsFixtures.deleteCart;
import static commercetools.category.CategoryFixtures.withCategory;
import static commercetools.product.ProductFixtures.createProduct;
import static commercetools.product.ProductFixtures.createProductTypeDraft;
import static commercetools.product_type.ProductTypeFixtures.withProductType;
import static commercetools.tax_category.TaxCategoryFixtures.withTaxCategory;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder;
import commercetools.product.ProductFixtures;
import commercetools.tax_category.TaxCategoryFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartLineItemTests {

    @Test
    public void createNewCartWithLineItems() {
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

    @Test
    public void createNewCartWithCustomLineItems() {
        TaxCategoryFixtures.withTaxCategory(taxCategory -> {
            final CustomLineItemDraft customLineItemDraft = CustomLineItemDraftBuilder.of()
                    .name(builder -> builder.addValue("test", "test"))
                    .quantity(1L)
                    .taxCategory(TaxCategoryResourceIdentifierBuilder.of().id(taxCategory.getId()).build())
                    .money(moneyBuilder -> moneyBuilder.centAmount(1000L).currencyCode("EUR"))
                    .slug("test-slug")
                    .priceMode(CustomLineItemPriceMode.STANDARD)
                    .build();
            final CartDraft cartDraft = CartDraftBuilder.of()
                    .currency("EUR")
                    .country("DE")
                    .customLineItems(customLineItemDraft)
                    .build();

            final Cart createdCart = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .post(cartDraft)
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(createdCart.getCustomLineItems()).hasSize(1);

            CartsFixtures.deleteCart(createdCart.getId(), createdCart.getVersion());
        });

    }
}
