
package commercetools.cart;

import static commercetools.product.ProductFixtures.withPublishedProduct;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart.CartDraftBuilder;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.common.BaseAddressBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartCreateTests {

    @Test
    public void createCartWithMultipleItemShippingAddresses() {
        withPublishedProduct(product -> {
            final BaseAddress address1 = BaseAddressBuilder.of()
                    .country(Locale.GERMANY.getCountry())
                    .key(CommercetoolsTestUtils.randomKey())
                    .build();
            final BaseAddress address2 = BaseAddressBuilder.of()
                    .country(Locale.FRANCE.getCountry())
                    .key(CommercetoolsTestUtils.randomKey())
                    .build();
            final BaseAddress address3 = BaseAddressBuilder.of()
                    .country(Locale.ITALY.getCountry())
                    .key(CommercetoolsTestUtils.randomKey())
                    .build();

            final List<BaseAddress> baseAddresses = Arrays.asList(address1, address2, address3);

            final CartDraft cartDraft = CartDraftBuilder.of()
                    .itemShippingAddresses(baseAddresses)
                    .currency("EUR")
                    .country("DE")
                    .build();

            final Cart createdCart = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .create(cartDraft)
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(createdCart.getId()).isNotEmpty();
            Assertions.assertThat(createdCart.getItemShippingAddresses()).hasSize(3);
        });
    }
}
