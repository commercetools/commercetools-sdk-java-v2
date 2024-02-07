
package com.commercetools.api.models.discount_code;

import java.time.ZonedDateTime;
import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class DiscountCodeDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeDraftBuilder builder) {
        DiscountCodeDraft discountCodeDraft = builder.buildUnchecked();
        Assertions.assertThat(discountCodeDraft).isInstanceOf(DiscountCodeDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeDraft.builder().key("key") },
                new Object[] { DiscountCodeDraft.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { DiscountCodeDraft.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { DiscountCodeDraft.builder().code("code") },
                new Object[] { DiscountCodeDraft.builder()
                        .cartDiscounts(Collections.singletonList(
                            new com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl())) },
                new Object[] { DiscountCodeDraft.builder().cartPredicate("cartPredicate") },
                new Object[] { DiscountCodeDraft.builder().isActive(true) },
                new Object[] { DiscountCodeDraft.builder().maxApplications(9L) },
                new Object[] { DiscountCodeDraft.builder().maxApplicationsPerCustomer(5L) },
                new Object[] { DiscountCodeDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { DiscountCodeDraft.builder().groups(Collections.singletonList("groups")) },
                new Object[] { DiscountCodeDraft.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { DiscountCodeDraft.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void key() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void code() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }

    @Test
    public void cartDiscounts() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setCartDiscounts(Collections
                .singletonList(new com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl()));
        Assertions.assertThat(value.getCartDiscounts())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl()));
    }

    @Test
    public void cartPredicate() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setCartPredicate("cartPredicate");
        Assertions.assertThat(value.getCartPredicate()).isEqualTo("cartPredicate");
    }

    @Test
    public void isActive() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }

    @Test
    public void maxApplications() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setMaxApplications(9L);
        Assertions.assertThat(value.getMaxApplications()).isEqualTo(9L);
    }

    @Test
    public void maxApplicationsPerCustomer() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setMaxApplicationsPerCustomer(5L);
        Assertions.assertThat(value.getMaxApplicationsPerCustomer()).isEqualTo(5L);
    }

    @Test
    public void custom() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void groups() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setGroups(Collections.singletonList("groups"));
        Assertions.assertThat(value.getGroups()).isEqualTo(Collections.singletonList("groups"));
    }

    @Test
    public void validFrom() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        DiscountCodeDraft value = DiscountCodeDraft.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
