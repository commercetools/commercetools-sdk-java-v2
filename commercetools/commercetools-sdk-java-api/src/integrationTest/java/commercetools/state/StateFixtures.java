
package commercetools.state;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.state.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class StateFixtures {

    public static void withState(final StateDraft stateDraft, final Consumer<State> consumer) {
        State state = createState(stateDraft);
        try {
            consumer.accept(state);
        }
        finally {
            deleteState(state.getId(), state.getVersion());
        }
    }

    public static void withState(final Consumer<State> consumer) {
        State state = createState();
        try {
            consumer.accept(state);
        }
        finally {
            deleteState(state.getId(), state.getVersion());
        }
    }

    public static void withUpdateableState(final UnaryOperator<State> operator) {
        State state = createState();
        try {
            state = operator.apply(state);
        }
        finally {
            deleteState(state.getId(), state.getVersion());
        }
    }

    public static State createState() {
        StateDraft stateDraft = StateDraftBuilder.of()
                .type(StateTypeEnum.LINE_ITEM_STATE)
                .key(CommercetoolsTestUtils.randomKey())
                .roles(Arrays.asList(StateRoleEnum.RETURN))
                .build();

        return createState(stateDraft);
    }

    public static State createState(StateDraft stateDraft) {

        State state = CommercetoolsTestUtils.getProjectApiRoot().states().post(stateDraft).executeBlocking().getBody();

        Assertions.assertNotNull(state);
        Assertions.assertEquals(stateDraft.getKey(), state.getKey());

        return state;
    }

    public static State deleteState(final String id, final Long version) {
        State state = CommercetoolsTestUtils.getProjectApiRoot()
                .states()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(state);
        Assertions.assertEquals(state.getId(), id);

        return state;
    }
}
