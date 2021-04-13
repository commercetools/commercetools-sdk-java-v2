
package commercetools.zone;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.zone.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class ZoneIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Zone zone = ZoneFixtures.createZone();
        Zone deletedZone = ZoneFixtures.deleteZone(zone.getId(), zone.getVersion());

        Assert.assertNotNull(deletedZone);
        Assert.assertEquals(zone.getId(), deletedZone.getId());
    }

    @Test
    public void getById() {
        ZoneFixtures.withZone(zone -> {
            Zone queriedZone = CommercetoolsTestUtils.getProjectRoot()
                    .zones()
                    .withId(zone.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedZone);
            Assert.assertEquals(zone.getId(), queriedZone.getId());
        });
    }

    @Test
    public void getByKey() {
        ZoneFixtures.withZone(zone -> {
            Zone queriedZone = CommercetoolsTestUtils.getProjectRoot()
                    .zones()
                    .withKey(zone.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedZone);
            Assert.assertEquals(zone.getId(), queriedZone.getId());
        });
    }

    @Test
    public void query() {
        ZoneFixtures.withZone(zone -> {
            ZonePagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                    .zones()
                    .get()
                    .withWhere("id=" + "\"" + zone.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), zone.getId());
        });
    }

    @Test
    public void updateById() {
        ZoneFixtures.withUpdateableZone(zone -> {
            List<ZoneUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ZoneSetKeyActionBuilder.of().key(newKey).build());

            Zone updatedZone = CommercetoolsTestUtils.getProjectRoot()
                    .zones()
                    .withId(zone.getId())
                    .post(ZoneUpdateBuilder.of().actions(updateActions).version(zone.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedZone);
            Assert.assertEquals(updatedZone.getKey(), newKey);

            return updatedZone;
        });
    }

    @Test
    public void updateByKey() {
        ZoneFixtures.withUpdateableZone(zone -> {
            List<ZoneUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ZoneSetKeyActionBuilder.of().key(newKey).build());

            Zone updatedZone = CommercetoolsTestUtils.getProjectRoot()
                    .zones()
                    .withKey(zone.getKey())
                    .post(ZoneUpdateBuilder.of().actions(updateActions).version(zone.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedZone);
            Assert.assertEquals(updatedZone.getKey(), newKey);

            return updatedZone;
        });
    }

    @Test
    public void deleteByKey() {
        Zone zone = ZoneFixtures.createZone();
        Zone deletedZone = ZoneFixtures.deleteZone(zone.getId(), zone.getVersion());

        Assert.assertNotNull(deletedZone);
        Assert.assertEquals(zone.getId(), deletedZone.getId());
    }

}
