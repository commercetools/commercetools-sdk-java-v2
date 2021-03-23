
package commercetools.store;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.store.StoreDraft;
import com.commercetools.api.models.store.StoreDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class StoreFixtures {

    public static void withStore(final Consumer<Store> consumer) {
        Store store = createStore();
        consumer.accept(store);
        deleteStore(store.getId(), store.getVersion());
    }

    public static void withUpdateableStore(final UnaryOperator<Store> operator) {
        Store store = createStore();
        store = operator.apply(store);
        deleteStore(store.getId(), store.getVersion());
    }

    public static Store createStore() {
        StoreDraft storeDraft = StoreDraftBuilder.of().key(CommercetoolsTestUtils.randomKey()).build();

        Store store = CommercetoolsTestUtils.getProjectRoot().stores().post(storeDraft).executeBlocking().getBody();

        Assert.assertNotNull(store);
        Assert.assertEquals(storeDraft.getKey(), store.getKey());

        return store;
    }

    public static Store deleteStore(final String id, final Long version) {
        Store store = CommercetoolsTestUtils.getProjectRoot()
                .stores()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(store);
        Assert.assertEquals(store.getId(), id);

        return store;
    }

}
