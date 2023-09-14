
package com.commercetools;

import static org.assertj.core.api.Assertions.assertThat;

import com.commercetools.api.models.cart_discount.*;

import org.junit.jupiter.api.Test;

public class CartDiscountTest {
    @Test
    public void absoluteValueToDraft() {
        CartDiscountValue cartDiscountValue = CartDiscountValue.absoluteBuilder()
                .withMoney(m -> m.centAmount(100L).currencyCode("EUR").fractionDigits(2))
                .build();
        assertThat(cartDiscountValue.toDraft()).isInstanceOfSatisfying(CartDiscountValueAbsoluteDraft.class,
            draft -> assertThat(draft.getMoney().get(0)).satisfies(money -> {
                assertThat(money.getCentAmount()).isEqualTo(100);
                assertThat(money.getCurrencyCode()).isEqualTo("EUR");
            }));
    }

    @Test
    public void fixedValueToDraft() {
        CartDiscountValue cartDiscountValue = CartDiscountValue.fixedBuilder()
                .withMoney(m -> m.centPrecisionBuilder().centAmount(100L).currencyCode("EUR").fractionDigits(2))
                .build();
        assertThat(cartDiscountValue.toDraft()).isInstanceOfSatisfying(CartDiscountValueFixedDraft.class,
            draft -> assertThat(draft.getMoney().get(0)).satisfies(money -> {
                assertThat(money.getCentAmount()).isEqualTo(100);
                assertThat(money.getCurrencyCode()).isEqualTo("EUR");
            }));
    }

    @Test
    public void relativeValueToDraft() {
        CartDiscountValue cartDiscountValue = CartDiscountValue.relativeBuilder().permyriad(100L).build();
        assertThat(cartDiscountValue.toDraft()).isInstanceOfSatisfying(CartDiscountValueRelativeDraft.class,
            draft -> assertThat(draft.getPermyriad()).isEqualTo(100));
    }

    @Test
    public void giftLineItemValueToDraft() {
        CartDiscountValue cartDiscountValue = CartDiscountValue.giftLineItemBuilder()
                .product(p -> p.id("foo"))
                .variantId(1L)
                .build();
        assertThat(cartDiscountValue.toDraft()).isInstanceOfSatisfying(CartDiscountValueGiftLineItemDraft.class,
            draft -> {
                assertThat(draft.getProduct().getId()).isEqualTo("foo");
                assertThat(draft.getVariantId()).isEqualTo(1);
                assertThat(draft.getSupplyChannel()).isNull();
                assertThat(draft.getDistributionChannel()).isNull();
            });

        CartDiscountValue distributionCartDiscountValue = CartDiscountValue.giftLineItemBuilder()
                .product(p -> p.id("foo"))
                .variantId(1L)
                .distributionChannel(c -> c.id("foo"))
                .build();
        assertThat(distributionCartDiscountValue.toDraft())
                .isInstanceOfSatisfying(CartDiscountValueGiftLineItemDraft.class, draft -> {
                    assertThat(draft.getProduct().getId()).isEqualTo("foo");
                    assertThat(draft.getVariantId()).isEqualTo(1);
                    assertThat(draft.getSupplyChannel()).isNull();
                    assertThat(draft.getDistributionChannel().getId()).isEqualTo("foo");
                });

        CartDiscountValue supplyCartDiscountValue = CartDiscountValue.giftLineItemBuilder()
                .product(p -> p.id("foo"))
                .variantId(1L)
                .supplyChannel(c -> c.id("foo"))
                .build();
        assertThat(supplyCartDiscountValue.toDraft()).isInstanceOfSatisfying(CartDiscountValueGiftLineItemDraft.class,
            draft -> {
                assertThat(draft.getProduct().getId()).isEqualTo("foo");
                assertThat(draft.getVariantId()).isEqualTo(1);
                assertThat(draft.getSupplyChannel().getId()).isEqualTo("foo");
                assertThat(draft.getDistributionChannel()).isNull();
            });

        CartDiscountValue channelsCartDiscountValue = CartDiscountValue.giftLineItemBuilder()
                .product(p -> p.id("foo"))
                .variantId(1L)
                .supplyChannel(c -> c.id("foo"))
                .distributionChannel(c -> c.id("foo"))
                .build();
        assertThat(channelsCartDiscountValue.toDraft()).isInstanceOfSatisfying(CartDiscountValueGiftLineItemDraft.class,
            draft -> {
                assertThat(draft.getProduct().getId()).isEqualTo("foo");
                assertThat(draft.getVariantId()).isEqualTo(1);
                assertThat(draft.getSupplyChannel().getId()).isEqualTo("foo");
                assertThat(draft.getDistributionChannel().getId()).isEqualTo("foo");
            });

    }
}
