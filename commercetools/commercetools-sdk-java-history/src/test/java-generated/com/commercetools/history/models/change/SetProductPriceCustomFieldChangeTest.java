
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetProductPriceCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetProductPriceCustomFieldChangeBuilder builder) {
        SetProductPriceCustomFieldChange setProductPriceCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setProductPriceCustomFieldChange).isInstanceOf(SetProductPriceCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetProductPriceCustomFieldChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetProductPriceCustomFieldChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue",
                        SetProductPriceCustomFieldChange.builder()
                                .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "catalogData", SetProductPriceCustomFieldChange.builder().catalogData("catalogData") },
                new Object[] { "variant", SetProductPriceCustomFieldChange.builder().variant("variant") },
                new Object[] { "priceId", SetProductPriceCustomFieldChange.builder().priceId("priceId") },
                new Object[] { "customTypeId",
                        SetProductPriceCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "name", SetProductPriceCustomFieldChange.builder().name("name") } };
    }

    @Test
    public void change() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void catalogData() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void priceId() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void customTypeId() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void name() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
