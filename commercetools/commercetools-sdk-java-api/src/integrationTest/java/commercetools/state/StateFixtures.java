
package commercetools.state;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.state.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class StateFixtures {

    public static void withState(final Consumer<State> consumer) {
        State state = createState();
        consumer.accept(state);
        deleteState(state.getId(), state.getVersion());
    }

    public static void withUpdateableState(final UnaryOperator<State> operator) {
        State state = createState();
        state = operator.apply(state);
        deleteState(state.getId(), state.getVersion());
    }

    public static State createState() {
        StateDraft stateDraft = StateDraftBuilder.of()
                .type(StateTypeEnum.LINE_ITEM_STATE)
                .key(CommercetoolsTestUtils.randomKey())
                .roles(Arrays.asList(StateRoleEnum.RETURN))
                .build();

        State state = CommercetoolsTestUtils.getProjectRoot().states().post(stateDraft).executeBlocking().getBody();

        Assert.assertNotNull(state);
        Assert.assertEquals(stateDraft.getKey(), state.getKey());

        return state;
    }

    public static State deleteState(final String id, final Long version) {
        State state = CommercetoolsTestUtils.getProjectRoot()
                .states()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(state);
        Assert.assertEquals(state.getId(), id);

        return state;
    }
}
