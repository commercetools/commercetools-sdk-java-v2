
package com.commercetools.importapi.models.discount_codes;

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
public class DiscountCodeImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeImportBuilder builder) {
        DiscountCodeImport discountCodeImport = builder.buildUnchecked();
        Assertions.assertThat(discountCodeImport).isInstanceOf(DiscountCodeImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeImport.builder().key("key") },
                new Object[] { DiscountCodeImport.builder()
                        .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { DiscountCodeImport.builder()
                        .description(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { DiscountCodeImport.builder().code("code") },
                new Object[] { DiscountCodeImport.builder()
                        .cartDiscounts(Collections.singletonList(
                            new com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl())) },
                new Object[] { DiscountCodeImport.builder().cartPredicate("cartPredicate") },
                new Object[] { DiscountCodeImport.builder().isActive(true) },
                new Object[] { DiscountCodeImport.builder().maxApplications(9L) },
                new Object[] { DiscountCodeImport.builder().maxApplicationsPerCustomer(5L) },
                new Object[] { DiscountCodeImport.builder().groups(Collections.singletonList("groups")) },
                new Object[] { DiscountCodeImport.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { DiscountCodeImport.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { DiscountCodeImport.builder()
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
