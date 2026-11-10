
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetAssetCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetAssetCustomTypeActionBuilder builder) {
        CategorySetAssetCustomTypeAction categorySetAssetCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetAssetCustomTypeAction).isInstanceOf(CategorySetAssetCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "assetId", CategorySetAssetCustomTypeAction.builder().assetId("assetId") },
                new Object[] { "assetKey", CategorySetAssetCustomTypeAction.builder().assetKey("assetKey") },
                new Object[] { "type",
                        CategorySetAssetCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", CategorySetAssetCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void assetId() {
        CategorySetAssetCustomTypeAction value = CategorySetAssetCustomTypeAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        CategorySetAssetCustomTypeAction value = CategorySetAssetCustomTypeAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void type() {
        CategorySetAssetCustomTypeAction value = CategorySetAssetCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        CategorySetAssetCustomTypeAction value = CategorySetAssetCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
