
package com.commercetools.api.models.staged_quote;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteBuilder builder) {
        StagedQuote stagedQuote = builder.buildUnchecked();
        Assertions.assertThat(stagedQuote).isInstanceOf(StagedQuote.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", StagedQuote.builder().id("id") },
                new Object[] { "version", StagedQuote.builder().version(2L) },
                new Object[] { "key", StagedQuote.builder().key("key") },
                new Object[] { "createdAt", StagedQuote.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        StagedQuote.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        StagedQuote.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        StagedQuote.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "stagedQuoteState",
                        StagedQuote.builder()
                                .stagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState
                                        .findEnum("InProgress")) },
                new Object[] { "customer",
                        StagedQuote.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "quoteRequest", StagedQuote.builder()
                        .quoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestReferenceImpl()) },
                new Object[] { "quotationCart",
                        StagedQuote.builder()
                                .quotationCart(new com.commercetools.api.models.cart.CartReferenceImpl()) },
                new Object[] { "validTo", StagedQuote.builder().validTo(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "sellerComment", StagedQuote.builder().sellerComment("sellerComment") },
                new Object[] { "custom",
                        StagedQuote.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "state",
                        StagedQuote.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "purchaseOrderNumber",
                        StagedQuote.builder().purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { "businessUnit", StagedQuote.builder()
                        .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "store",
                        StagedQuote.builder().store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) } };
    }

    @Test
    public void id() {
        StagedQuote value = StagedQuote.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        StagedQuote value = StagedQuote.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void key() {
        StagedQuote value = StagedQuote.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void createdAt() {
        StagedQuote value = StagedQuote.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        StagedQuote value = StagedQuote.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        StagedQuote value = StagedQuote.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        StagedQuote value = StagedQuote.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void stagedQuoteState() {
        StagedQuote value = StagedQuote.of();
        value.setStagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getStagedQuoteState())
                .isEqualTo(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
    }

    @Test
    public void customer() {
        StagedQuote value = StagedQuote.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void quoteRequest() {
        StagedQuote value = StagedQuote.of();
        value.setQuoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestReferenceImpl());
        Assertions.assertThat(value.getQuoteRequest())
                .isEqualTo(new com.commercetools.api.models.quote_request.QuoteRequestReferenceImpl());
    }

    @Test
    public void quotationCart() {
        StagedQuote value = StagedQuote.of();
        value.setQuotationCart(new com.commercetools.api.models.cart.CartReferenceImpl());
        Assertions.assertThat(value.getQuotationCart())
                .isEqualTo(new com.commercetools.api.models.cart.CartReferenceImpl());
    }

    @Test
    public void validTo() {
        StagedQuote value = StagedQuote.of();
        value.setValidTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidTo()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void sellerComment() {
        StagedQuote value = StagedQuote.of();
        value.setSellerComment("sellerComment");
        Assertions.assertThat(value.getSellerComment()).isEqualTo("sellerComment");
    }

    @Test
    public void custom() {
        StagedQuote value = StagedQuote.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void state() {
        StagedQuote value = StagedQuote.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void purchaseOrderNumber() {
        StagedQuote value = StagedQuote.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void businessUnit() {
        StagedQuote value = StagedQuote.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void store() {
        StagedQuote value = StagedQuote.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }
}
