
package com.commercetools.importapi.models.discount_codes;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeImportBuilder builder) {
        DiscountCodeImport discountCodeImport = builder.buildUnchecked();
        Assertions.assertThat(discountCodeImport).isInstanceOf(DiscountCodeImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", DiscountCodeImport.builder().key("key") },
                new Object[] { "name",
                        DiscountCodeImport.builder()
                                .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        DiscountCodeImport.builder()
                                .description(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "code", DiscountCodeImport.builder().code("code") },
                new Object[] { "cartDiscounts",
                        DiscountCodeImport.builder()
                                .cartDiscounts(Collections.singletonList(
                                    new com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl())) },
                new Object[] { "cartPredicate", DiscountCodeImport.builder().cartPredicate("cartPredicate") },
                new Object[] { "isActive", DiscountCodeImport.builder().isActive(true) },
                new Object[] { "maxApplications", DiscountCodeImport.builder().maxApplications(9L) },
                new Object[] { "maxApplicationsPerCustomer",
                        DiscountCodeImport.builder().maxApplicationsPerCustomer(5L) },
                new Object[] { "groups", DiscountCodeImport.builder().groups(Collections.singletonList("groups")) },
                new Object[] { "validFrom",
                        DiscountCodeImport.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        DiscountCodeImport.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "custom", DiscountCodeImport.builder()
                        .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) } };
    }

    @Test
    public void key() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setName(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void code() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }

    @Test
    public void cartDiscounts() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setCartDiscounts(
            Collections.singletonList(new com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl()));
        Assertions.assertThat(value.getCartDiscounts())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl()));
    }

    @Test
    public void cartPredicate() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setCartPredicate("cartPredicate");
        Assertions.assertThat(value.getCartPredicate()).isEqualTo("cartPredicate");
    }

    @Test
    public void isActive() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }

    @Test
    public void maxApplications() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setMaxApplications(9L);
        Assertions.assertThat(value.getMaxApplications()).isEqualTo(9L);
    }

    @Test
    public void maxApplicationsPerCustomer() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setMaxApplicationsPerCustomer(5L);
        Assertions.assertThat(value.getMaxApplicationsPerCustomer()).isEqualTo(5L);
    }

    @Test
    public void groups() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setGroups(Collections.singletonList("groups"));
        Assertions.assertThat(value.getGroups()).isEqualTo(Collections.singletonList("groups"));
    }

    @Test
    public void validFrom() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        DiscountCodeImport value = DiscountCodeImport.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }
}
