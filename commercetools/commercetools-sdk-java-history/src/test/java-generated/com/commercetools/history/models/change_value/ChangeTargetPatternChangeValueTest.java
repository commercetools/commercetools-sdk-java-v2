
package com.commercetools.history.models.change_value;

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
public class ChangeTargetPatternChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTargetPatternChangeValueBuilder builder) {
        ChangeTargetPatternChangeValue changeTargetPatternChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeTargetPatternChangeValue).isInstanceOf(ChangeTargetPatternChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ChangeTargetPatternChangeValue.builder()
                        .triggerPattern(Collections.singletonList(
                            new com.commercetools.history.models.cart_discount.PatternComponentImpl())) },
                new Object[] { ChangeTargetPatternChangeValue.builder()
                        .targetPattern(Collections.singletonList(
                            new com.commercetools.history.models.cart_discount.PatternComponentImpl())) },
                new Object[] { ChangeTargetPatternChangeValue.builder().maxOccurrence(7) },
                new Object[] { ChangeTargetPatternChangeValue.builder()
                        .selectionMode(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest")) } };
    }

    @Test
    public void triggerPattern() {
        ChangeTargetPatternChangeValue value = ChangeTargetPatternChangeValue.of();
        value.setTriggerPattern(
            Collections.singletonList(new com.commercetools.history.models.cart_discount.PatternComponentImpl()));
        Assertions.assertThat(value.getTriggerPattern())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.cart_discount.PatternComponentImpl()));
    }

    @Test
    public void targetPattern() {
        ChangeTargetPatternChangeValue value = ChangeTargetPatternChangeValue.of();
        value.setTargetPattern(
            Collections.singletonList(new com.commercetools.history.models.cart_discount.PatternComponentImpl()));
        Assertions.assertThat(value.getTargetPattern())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.cart_discount.PatternComponentImpl()));
    }

    @Test
    public void maxOccurrence() {
        ChangeTargetPatternChangeValue value = ChangeTargetPatternChangeValue.of();
        value.setMaxOccurrence(7);
        Assertions.assertThat(value.getMaxOccurrence()).isEqualTo(7);
    }

    @Test
    public void selectionMode() {
        ChangeTargetPatternChangeValue value = ChangeTargetPatternChangeValue.of();
        value.setSelectionMode(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest"));
        Assertions.assertThat(value.getSelectionMode())
                .isEqualTo(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest"));
    }
}
