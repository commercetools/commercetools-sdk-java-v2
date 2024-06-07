
package com.commercetools.api.models.me;

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
public class MyCartDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartDraftBuilder builder) {
        MyCartDraft myCartDraft = builder.buildUnchecked();
        Assertions.assertThat(myCartDraft).isInstanceOf(MyCartDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCartDraft.builder().currency("currency") },
                new Object[] { MyCartDraft.builder().customerEmail("customerEmail") },
                new Object[] { MyCartDraft.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { MyCartDraft.builder()
                        .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) },
                new Object[] {
                        MyCartDraft.builder()
                                .lineItems(Collections
                                        .singletonList(new com.commercetools.api.models.me.MyLineItemDraftImpl())) },
                new Object[] {
                        MyCartDraft.builder().taxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform")) },
                new Object[] { MyCartDraft.builder()
                        .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) },
                new Object[] { MyCartDraft.builder()
                        .billingAddress(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { MyCartDraft.builder()
                        .shippingAddress(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { MyCartDraft.builder()
                        .shippingMethod(
                            new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl()) },
                new Object[] {
                        MyCartDraft.builder()
                                .itemShippingAddresses(Collections
                                        .singletonList(new com.commercetools.api.models.common.BaseAddressImpl())) },
                new Object[] { MyCartDraft.builder()
                        .shippingMode(com.commercetools.api.models.cart.ShippingMode.findEnum("Single")) },
                new Object[] { MyCartDraft.builder().discountCodes(Collections.singletonList("discountCodes")) },
                new Object[] { MyCartDraft.builder().country("country") },
                new Object[] { MyCartDraft.builder().locale("locale") },
                new Object[] { MyCartDraft.builder().deleteDaysAfterLastModification(3L) }, new Object[] {
                        MyCartDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void currency() {
        MyCartDraft value = MyCartDraft.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void customerEmail() {
        MyCartDraft value = MyCartDraft.of();
        value.setCustomerEmail("customerEmail");
        Assertions.assertThat(value.getCustomerEmail()).isEqualTo("customerEmail");
    }

    @Test
    public void businessUnit() {
        MyCartDraft value = MyCartDraft.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void store() {
        MyCartDraft value = MyCartDraft.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }

    @Test
    public void lineItems() {
        MyCartDraft value = MyCartDraft.of();
        value.setLineItems(Collections.singletonList(new com.commercetools.api.models.me.MyLineItemDraftImpl()));
        Assertions.assertThat(value.getLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.me.MyLineItemDraftImpl()));
    }

    @Test
    public void taxMode() {
        MyCartDraft value = MyCartDraft.of();
        value.setTaxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
    }

    @Test
    public void inventoryMode() {
        MyCartDraft value = MyCartDraft.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }

    @Test
    public void billingAddress() {
        MyCartDraft value = MyCartDraft.of();
        value.setBillingAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getBillingAddress())
                .isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void shippingAddress() {
        MyCartDraft value = MyCartDraft.of();
        value.setShippingAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void shippingMethod() {
        MyCartDraft value = MyCartDraft.of();
        value.setShippingMethod(
            new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl());
        Assertions.assertThat(value.getShippingMethod())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl());
    }

    @Test
    public void itemShippingAddresses() {
        MyCartDraft value = MyCartDraft.of();
        value.setItemShippingAddresses(
            Collections.singletonList(new com.commercetools.api.models.common.BaseAddressImpl()));
        Assertions.assertThat(value.getItemShippingAddresses())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.BaseAddressImpl()));
    }

    @Test
    public void shippingMode() {
        MyCartDraft value = MyCartDraft.of();
        value.setShippingMode(com.commercetools.api.models.cart.ShippingMode.findEnum("Single"));
        Assertions.assertThat(value.getShippingMode())
                .isEqualTo(com.commercetools.api.models.cart.ShippingMode.findEnum("Single"));
    }

    @Test
    public void discountCodes() {
        MyCartDraft value = MyCartDraft.of();
        value.setDiscountCodes(Collections.singletonList("discountCodes"));
        Assertions.assertThat(value.getDiscountCodes()).isEqualTo(Collections.singletonList("discountCodes"));
    }

    @Test
    public void country() {
        MyCartDraft value = MyCartDraft.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void locale() {
        MyCartDraft value = MyCartDraft.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void deleteDaysAfterLastModification() {
        MyCartDraft value = MyCartDraft.of();
        value.setDeleteDaysAfterLastModification(3L);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3L);
    }

    @Test
    public void custom() {
        MyCartDraft value = MyCartDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
