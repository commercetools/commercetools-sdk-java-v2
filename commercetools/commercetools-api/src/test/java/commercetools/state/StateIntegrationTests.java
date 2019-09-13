package commercetools.state;

import com.commercetools.models.state.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StateIntegrationTests {
    
    @Test
    public void createAndDeleteById() {
        State state = StateFixtures.createState();
        State deletedState = StateFixtures.deleteState(state.getId(), state.getVersion());
        Assertions.assertEquals(deletedState.getId(), state.getId());
    }
    
    @Test
    public void getById() {
        StateFixtures.withState(state -> {
            State queriedState = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .states()
                    .withId(state.getId())
                    .get()
                    .executeBlocking().getBody();
            
            Assertions.assertNotNull(queriedState);
            Assertions.assertEquals(state.getId(), queriedState.getId());
        });
    }
    
    @Test
    public void query() {
        StateFixtures.withState(state -> {
            StatePagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .states()
                    .get()
                    .addWhere("id=" + "\"" + state.getId() + "\"")
                    .executeBlocking().getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), state.getId());
        });
    }
    
    @Test
    public void update(){
        StateFixtures.withUpdateableState(state -> {
            List<StateUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(StateChangeKeyActionBuilder.of().key(newKey).build());
            State updatedState = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .states()
                    .withId(state.getId())
                    .post(StateUpdateBuilder.of()
                            .actions(updateActions)
                            .version(state.getVersion())
                            .build())
                    .executeBlocking().getBody();

            Assertions.assertNotNull(updatedState);
            Assertions.assertEquals(updatedState.getKey(), newKey);
            return updatedState;
        });
    }
}
