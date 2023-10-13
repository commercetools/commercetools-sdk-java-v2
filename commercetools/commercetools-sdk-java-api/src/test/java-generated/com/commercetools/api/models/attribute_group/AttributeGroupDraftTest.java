
package com.commercetools.api.models.attribute_group;

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
public class AttributeGroupDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeGroupDraftBuilder builder) {
        AttributeGroupDraft attributeGroupDraft = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupDraft).isInstanceOf(AttributeGroupDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { AttributeGroupDraft.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { AttributeGroupDraft.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { AttributeGroupDraft.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.api.models.attribute_group.AttributeReferenceImpl())) },
                new Object[] { AttributeGroupDraft.builder().key("key") } };
    }

    @Test
    public void name() {
        AttributeGroupDraft value = AttributeGroupDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        AttributeGroupDraft value = AttributeGroupDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void attributes() {
        AttributeGroupDraft value = AttributeGroupDraft.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()));
    }

    @Test
    public void key() {
        AttributeGroupDraft value = AttributeGroupDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
