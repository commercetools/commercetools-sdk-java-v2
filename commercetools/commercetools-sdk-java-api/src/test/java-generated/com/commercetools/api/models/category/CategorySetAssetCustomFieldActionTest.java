
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetAssetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetAssetCustomFieldActionBuilder builder) {
        CategorySetAssetCustomFieldAction categorySetAssetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetAssetCustomFieldAction).isInstanceOf(CategorySetAssetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "assetId", CategorySetAssetCustomFieldAction.builder().assetId("assetId") },
                new Object[] { "assetKey", CategorySetAssetCustomFieldAction.builder().assetKey("assetKey") },
                new Object[] { "name", CategorySetAssetCustomFieldAction.builder().name("name") },
                new Object[] { "value", CategorySetAssetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void assetId() {
        CategorySetAssetCustomFieldAction value = CategorySetAssetCustomFieldAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        CategorySetAssetCustomFieldAction value = CategorySetAssetCustomFieldAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        CategorySetAssetCustomFieldAction value = CategorySetAssetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CategorySetAssetCustomFieldAction value = CategorySetAssetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
