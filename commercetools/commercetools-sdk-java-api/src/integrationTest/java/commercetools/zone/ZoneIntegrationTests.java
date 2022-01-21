
package commercetools.zone;

import static commercetools.zone.ZoneFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.zone.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZoneIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Zone zone = createZone();
        Zone deletedZone = deleteZone(zone.getId(), zone.getVersion());

        Assertions.assertNotNull(deletedZone);
        Assertions.assertEquals(zone.getId(), deletedZone.getId());
    }

    @Test
    public void getById() {
        withZone(zone -> {
            Zone queriedZone = CommercetoolsTestUtils.getProjectApiRoot()
                    .zones()
                    .withId(zone.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedZone);
            Assertions.assertEquals(zone.getId(), queriedZone.getId());
        });
    }

    @Test
    public void getByKey() {
        withZone(zone -> {
            Zone queriedZone = CommercetoolsTestUtils.getProjectApiRoot()
                    .zones()
                    .withKey(zone.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedZone);
            Assertions.assertEquals(zone.getId(), queriedZone.getId());
        });
    }

    @Test
    public void query() {
        withZone(zone -> {
            ZonePagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .zones()
                    .get()
                    .withWhere("id=" + "\"" + zone.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), zone.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableZone(zone -> {
            List<ZoneUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ZoneSetKeyActionBuilder.of().key(newKey).build());

            Zone updatedZone = CommercetoolsTestUtils.getProjectApiRoot()
                    .zones()
                    .withId(zone.getId())
                    .post(ZoneUpdateBuilder.of().actions(updateActions).version(zone.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedZone);
            Assertions.assertEquals(updatedZone.getKey(), newKey);

            return updatedZone;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableZone(zone -> {
            List<ZoneUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ZoneSetKeyActionBuilder.of().key(newKey).build());

            Zone updatedZone = CommercetoolsTestUtils.getProjectApiRoot()
                    .zones()
                    .withKey(zone.getKey())
                    .post(ZoneUpdateBuilder.of().actions(updateActions).version(zone.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedZone);
            Assertions.assertEquals(updatedZone.getKey(), newKey);

            return updatedZone;
        });
    }

    @Test
    public void deleteByKey() {
        Zone zone = createZone();
        Zone deletedZone = deleteZone(zone.getId(), zone.getVersion());

        Assertions.assertNotNull(deletedZone);
        Assertions.assertEquals(zone.getId(), deletedZone.getId());
    }

}
