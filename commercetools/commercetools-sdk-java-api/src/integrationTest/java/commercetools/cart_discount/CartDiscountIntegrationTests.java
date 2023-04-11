
package commercetools.cart_discount;

import static commercetools.cart_discount.CartDiscountFixtures.*;
import static commercetools.type.TypeFixtures.getFieldName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.commercetools.api.models.cart_discount.*;
import com.commercetools.api.models.common.ReferenceTypeId;
import commercetools.type.TypeFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartDiscountIntegrationTests {

    @Test
    public void ref() {
        Optional<ReferenceTypeId> optional = ReferenceTypeId.findEnumViaJsonName("product-type");
        Assertions.assertThat(optional.isPresent()).isTrue();
    }

    @Test
    public void createAndDelete() {
        CartDiscountValueDraft cartDiscountValueDraft = CartDiscountValueRelativeDraftBuilder.of()
                .permyriad(10L)
                .build();

        CartDiscountDraft cartDiscountDraft = CartDiscountDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .key(CommercetoolsTestUtils.randomKey())
                .value(cartDiscountValueDraft)
                .cartPredicate("country=\"DE\"")
                .target(CartDiscountShippingCostTargetBuilder.of().build())
                .sortOrder("0.42")
                .build();

        CartDiscount cartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                .cartDiscounts()
                .post(cartDiscountDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertThat(cartDiscount).isNotNull();
        Assertions.assertThat(cartDiscountDraft.getKey()).isEqualTo(cartDiscount.getKey());

        CartDiscount deletedCartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                .cartDiscounts()
                .withId(cartDiscount.getId())
                .delete()
                .withVersion(cartDiscount.getVersion())
                .executeBlocking()
                .getBody();

        Assertions.assertThat(deletedCartDiscount).isNotNull();
    }

    @Test
    public void updateById() {
        withUpdateableCartDiscount(cartDiscount -> {
            List<CartDiscountUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CartDiscountSetKeyActionBuilder.of().key(newKey).build());
            CartDiscount updatedCartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .cartDiscounts()
                    .withId(cartDiscount.getId())
                    .post(CartDiscountUpdateBuilder.of()
                            .actions(updateActions)
                            .version(cartDiscount.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(updatedCartDiscount).isNotNull();
            Assertions.assertThat(updatedCartDiscount.getKey()).isEqualTo(newKey);

            return updatedCartDiscount;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableCartDiscount(cartDiscount -> {
            List<CartDiscountUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CartDiscountSetKeyActionBuilder.of().key(newKey).build());
            CartDiscount updatedCartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                    .cartDiscounts()
                    .withKey(cartDiscount.getKey())
                    .post(CartDiscountUpdateBuilder.of()
                            .actions(updateActions)
                            .version(cartDiscount.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(updatedCartDiscount).isNotNull();
            Assertions.assertThat(updatedCartDiscount.getKey()).isEqualTo(newKey);

            return updatedCartDiscount;
        });
    }

    @Test
    public void setCustomTypeToExistingCartDiscount() {
        TypeFixtures.withType(type -> {
            withUpdateableCartDiscount(cartDiscount -> {
                final String FIELD_NAME = getFieldName(type);
                final String FIELD_VALUE = "field value";

                final CartDiscount updatedCartDiscount = CommercetoolsTestUtils.getProjectApiRoot()
                        .cartDiscounts()
                        .update(cartDiscount)
                        .with(builder -> builder.plus(actionBuilder -> actionBuilder.setCustomTypeBuilder()
                                .type(type.toResourceIdentifier())
                                .fields(fieldsBuilder -> fieldsBuilder.addValue(FIELD_NAME, FIELD_VALUE))))
                        .executeBlocking()
                        .getBody();

                Assertions.assertThat(updatedCartDiscount.getCustom().getFields().values())
                        .isEqualTo(Collections.singletonMap(FIELD_NAME, FIELD_VALUE));

                return updatedCartDiscount;
            });
        });
    }
}
