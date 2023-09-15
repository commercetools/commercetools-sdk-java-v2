
package com.commercetools.api.models.attribute_group;

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
public class AttributeGroupReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeGroupReferenceBuilder builder) {
        AttributeGroupReference attributeGroupReference = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupReference).isInstanceOf(AttributeGroupReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { AttributeGroupReference.builder()
                        .obj(new com.commercetools.api.models.attribute_group.AttributeGroupImpl()) },
                new Object[] { AttributeGroupReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        AttributeGroupReference value = AttributeGroupReference.of();
        value.setObj(new com.commercetools.api.models.attribute_group.AttributeGroupImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.attribute_group.AttributeGroupImpl());
    }

    @Test
    public void id() {
        AttributeGroupReference value = AttributeGroupReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
