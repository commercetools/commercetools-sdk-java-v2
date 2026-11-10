
package com.commercetools.api.models.staged_quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteSetCustomFieldActionBuilder builder) {
        StagedQuoteSetCustomFieldAction stagedQuoteSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteSetCustomFieldAction).isInstanceOf(StagedQuoteSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", StagedQuoteSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedQuoteSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        StagedQuoteSetCustomFieldAction value = StagedQuoteSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedQuoteSetCustomFieldAction value = StagedQuoteSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
