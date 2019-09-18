package commercetools.zone;

import com.commercetools.models.zone.Zone;
import com.commercetools.models.zone.ZoneDraft;
import com.commercetools.models.zone.ZoneDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ZoneFixtures {
    
    public static void withZone(final Consumer<Zone> consumer) {
        Zone zone = createZone();
        consumer.accept(zone);
        deleteZone(zone.getId(), zone.getVersion());
    }
    
    public static void withUpdateableZone(final UnaryOperator<Zone> operator) {
        Zone zone = createZone();
        zone = operator.apply(zone);
        deleteZone(zone.getId(), zone.getVersion());
    }
    
    public static Zone createZone() {
        ZoneDraft zoneDraft = ZoneDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .key(CommercetoolsTestUtils.randomKey())
                .build();
        
        Zone zone = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .zones()
                .post(zoneDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(zone);
        Assert.assertEquals(zoneDraft.getKey(), zone.getKey());
        
        return zone;
    }
    
    public static Zone deleteZone(final String id, final Long version) {
        Zone zone = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .zones()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(zone);
        Assert.assertEquals(zone.getId(), id);
        
        return zone;
    }
    
}
