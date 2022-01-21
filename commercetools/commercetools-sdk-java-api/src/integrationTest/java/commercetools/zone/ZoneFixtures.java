
package commercetools.zone;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.zone.Zone;
import com.commercetools.api.models.zone.ZoneDraft;
import com.commercetools.api.models.zone.ZoneDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class ZoneFixtures {

    public static void withZone(final Consumer<Zone> consumer) {
        Zone zone = createZone();
        try {
            consumer.accept(zone);
        }
        finally {
            deleteZone(zone.getId(), zone.getVersion());
        }
    }

    public static void withUpdateableZone(final UnaryOperator<Zone> operator) {
        Zone zone = createZone();
        try {
            zone = operator.apply(zone);
        }
        finally {
            deleteZone(zone.getId(), zone.getVersion());
        }
    }

    public static Zone createZone() {
        ZoneDraft zoneDraft = ZoneDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .key(CommercetoolsTestUtils.randomKey())
                .description(CommercetoolsTestUtils.randomString())
                .build();

        Zone zone = CommercetoolsTestUtils.getProjectApiRoot().zones().post(zoneDraft).executeBlocking().getBody();

        Assertions.assertNotNull(zone);
        Assertions.assertEquals(zoneDraft.getKey(), zone.getKey());

        return zone;
    }

    public static Zone deleteZone(final String id, final Long version) {
        Zone zone = CommercetoolsTestUtils.getProjectApiRoot()
                .zones()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(zone);
        Assertions.assertEquals(zone.getId(), id);

        return zone;
    }

}
