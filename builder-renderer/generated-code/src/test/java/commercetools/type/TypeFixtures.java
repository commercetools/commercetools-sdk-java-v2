package commercetools.type;

import com.commercetools.models.Type.ResourceTypeId;
import com.commercetools.models.Type.Type;
import com.commercetools.models.Type.TypeDraft;
import com.commercetools.models.Type.TypeDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class TypeFixtures {
    
    public static void withType(final Consumer<Type> consumer) {
        Type type = createType();
        consumer.accept(type);
        deleteType(type.getId(), type.getVersion());
    }
    
    public static void withUpdateableType(final UnaryOperator<Type> operator) {
        Type type = createType();
        type = operator.apply(type);
        deleteType(type.getId(), type.getVersion());
    }
    
    public static Type createType() {
        TypeDraft typeDraft = TypeDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .resourceTypeIds(Arrays.asList(ResourceTypeId.ASSET))
                .build();
        
        Type type = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .types()
                .post(typeDraft)
                .executeBlocking();

        Assertions.assertNotNull(type);
        Assertions.assertEquals(type.getKey(), typeDraft.getKey());
        
        return type;
    } 
    
    public static Type deleteType(final String id, final Long version) {
        Type type = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .types()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking();

        Assertions.assertNotNull(type);
        Assertions.assertEquals(type.getId(), id);
        
        return type;
    }
    
}
