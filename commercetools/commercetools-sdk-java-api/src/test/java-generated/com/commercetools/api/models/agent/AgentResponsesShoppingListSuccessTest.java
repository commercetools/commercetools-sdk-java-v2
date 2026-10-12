
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentResponsesShoppingListSuccessTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentResponsesShoppingListSuccessBuilder builder) {
        AgentResponsesShoppingListSuccess agentResponsesShoppingListSuccess = builder.buildUnchecked();
        Assertions.assertThat(agentResponsesShoppingListSuccess).isInstanceOf(AgentResponsesShoppingListSuccess.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "entity", AgentResponsesShoppingListSuccess.builder()
                .entity(new com.commercetools.api.models.shopping_list.ShoppingListImpl()) } };
    }

    @Test
    public void entity() {
        AgentResponsesShoppingListSuccess value = AgentResponsesShoppingListSuccess.of();
        value.setEntity(new com.commercetools.api.models.shopping_list.ShoppingListImpl());
        Assertions.assertThat(value.getEntity())
                .isEqualTo(new com.commercetools.api.models.shopping_list.ShoppingListImpl());
    }
}
