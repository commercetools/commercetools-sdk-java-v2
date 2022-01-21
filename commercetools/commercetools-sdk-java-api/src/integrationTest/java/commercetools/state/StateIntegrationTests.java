
package commercetools.state;

import static commercetools.state.StateFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.state.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StateIntegrationTests {

    @Test
    public void createAndDeleteById() {
        State state = createState();
        State deletedState = deleteState(state.getId(), state.getVersion());
        Assertions.assertEquals(deletedState.getId(), state.getId());
    }

    @Test
    public void getById() {
        withState(state -> {
            State queriedState = CommercetoolsTestUtils.getProjectApiRoot()
                    .states()
                    .withId(state.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedState);
            Assertions.assertEquals(state.getId(), queriedState.getId());
        });
    }

    @Test
    public void query() {
        withState(state -> {
            StatePagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .states()
                    .get()
                    .withWhere("id=" + "\"" + state.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), state.getId());
        });
    }

    @Test
    public void update() {
        withUpdateableState(state -> {
            List<StateUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(StateChangeKeyActionBuilder.of().key(newKey).build());
            State updatedState = CommercetoolsTestUtils.getProjectApiRoot()
                    .states()
                    .withId(state.getId())
                    .post(StateUpdateBuilder.of().actions(updateActions).version(state.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedState);
            Assertions.assertEquals(updatedState.getKey(), newKey);
            return updatedState;
        });
    }
}
