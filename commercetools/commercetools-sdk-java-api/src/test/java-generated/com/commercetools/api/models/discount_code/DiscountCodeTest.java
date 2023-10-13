
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
public class DiscountCodeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeBuilder builder) {
        DiscountCode discountCode = builder.buildUnchecked();
        Assertions.assertThat(discountCode).isInstanceOf(DiscountCode.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCode.builder().id("id") },
                new Object[] { DiscountCode.builder().version(2L) },
                new Object[] { DiscountCode.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { DiscountCode.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { DiscountCode.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] {
                        DiscountCode.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] {
                        DiscountCode.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { DiscountCode.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { DiscountCode.builder().code("code") },
                new Object[] { DiscountCode.builder()
                        .cartDiscounts(Collections.singletonList(
                            new com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl())) },
                new Object[] { DiscountCode.builder().cartPredicate("cartPredicate") },
                new Object[] { DiscountCode.builder().isActive(true) },
                new Object[] {
                        DiscountCode.builder()
                                .references(Collections
                                        .singletonList(new com.commercetools.api.models.common.ReferenceImpl())) },
                new Object[] { DiscountCode.builder().maxApplications(9L) },
                new Object[] { DiscountCode.builder().maxApplicationsPerCustomer(5L) },
                new Object[] {
                        DiscountCode.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { DiscountCode.builder().groups(Collections.singletonList("groups")) },
                new Object[] { DiscountCode.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { DiscountCode.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { DiscountCode.builder().applicationVersion(8L) } };
    }

    @Test
    public void id() {
        DiscountCode value = DiscountCode.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        DiscountCode value = DiscountCode.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        DiscountCode value = DiscountCode.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        DiscountCode value = DiscountCode.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        DiscountCode value = DiscountCode.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        DiscountCode value = DiscountCode.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void name() {
        DiscountCode value = DiscountCode.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        DiscountCode value = DiscountCode.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void code() {
        DiscountCode value = DiscountCode.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }

    @Test
    public void cartDiscounts() {
        DiscountCode value = DiscountCode.of();
        value.setCartDiscounts(
            Collections.singletonList(new com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl()));
        Assertions.assertThat(value.getCartDiscounts())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl()));
    }

    @Test
    public void cartPredicate() {
        DiscountCode value = DiscountCode.of();
        value.setCartPredicate("cartPredicate");
        Assertions.assertThat(value.getCartPredicate()).isEqualTo("cartPredicate");
    }

    @Test
    public void isActive() {
        DiscountCode value = DiscountCode.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }

    @Test
    public void references() {
        DiscountCode value = DiscountCode.of();
        value.setReferences(Collections.singletonList(new com.commercetools.api.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getReferences())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ReferenceImpl()));
    }

    @Test
    public void maxApplications() {
        DiscountCode value = DiscountCode.of();
        value.setMaxApplications(9L);
        Assertions.assertThat(value.getMaxApplications()).isEqualTo(9L);
    }

    @Test
    public void maxApplicationsPerCustomer() {
        DiscountCode value = DiscountCode.of();
        value.setMaxApplicationsPerCustomer(5L);
        Assertions.assertThat(value.getMaxApplicationsPerCustomer()).isEqualTo(5L);
    }

    @Test
    public void custom() {
        DiscountCode value = DiscountCode.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void groups() {
        DiscountCode value = DiscountCode.of();
        value.setGroups(Collections.singletonList("groups"));
        Assertions.assertThat(value.getGroups()).isEqualTo(Collections.singletonList("groups"));
    }

    @Test
    public void validFrom() {
        DiscountCode value = DiscountCode.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        DiscountCode value = DiscountCode.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void applicationVersion() {
        DiscountCode value = DiscountCode.of();
        value.setApplicationVersion(8L);
        Assertions.assertThat(value.getApplicationVersion()).isEqualTo(8L);
    }
}
