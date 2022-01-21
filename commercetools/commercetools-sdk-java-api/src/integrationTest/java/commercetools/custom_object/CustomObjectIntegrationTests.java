
package commercetools.custom_object;

import static commercetools.custom_object.CustomObjectFixtures.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.commercetools.api.models.custom_object.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.utils.ValueObject;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomObjectIntegrationTests {

    @Test
    public void createAndDeleteById() {
        CustomObject customObject = createCustomObject();
        CustomObject deletedCustomObject = deleteCustomObject(customObject.getContainer(), customObject.getKey(),
            customObject.getVersion());

        Assertions.assertEquals(customObject.getId(), deletedCustomObject.getId());
    }

    @Test
    public void getByContainerKey() {
        withCustomObject(customObject -> {
            CustomObject queriedCustomObject = CommercetoolsTestUtils.getProjectApiRoot()
                    .customObjects()
                    .withContainerAndKey(customObject.getContainer(), customObject.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedCustomObject);
            Assertions.assertEquals(customObject.getId(), queriedCustomObject.getId());
        });
    }

    @Test
    public void update() {
        withUpdateableCustomObject(customObject -> {
            CustomObjectDraft customObjectDraft = CustomObjectDraftBuilder.of()
                    .key(customObject.getKey())
                    .container(customObject.getContainer())
                    .value((ValueObject) () -> "foo")
                    .build();

            CustomObject updatedCustomObject = CommercetoolsTestUtils.getProjectApiRoot()
                    .customObjects()
                    .post(customObjectDraft)
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedCustomObject);
            Assertions.assertEquals(((Map<String, Object>) updatedCustomObject.getValue()).get("value"), "foo");

            return updatedCustomObject;
        });
    }

    @Test
    public void updateWithJsonNode() {
        withUpdateableCustomObject(customObject -> {
            CustomObjectDraft customObjectDraft = CustomObjectDraftBuilder.of()
                    .key(customObject.getKey())
                    .container(customObject.getContainer())
                    .value(JsonUtils.getConfiguredObjectMapper().createObjectNode().put("value", "foo"))
                    .build();

            CustomObject updatedCustomObject = CommercetoolsTestUtils.getProjectApiRoot()
                    .customObjects()
                    .post(customObjectDraft)
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedCustomObject);
            Assertions.assertEquals(
                updatedCustomObject.withCustomObject(customObject1 -> (Map<String, Object>) customObject1.getValue())
                        .get("value"),
                "foo");

            return updatedCustomObject;
        });
    }

    @Test
    public void updateWithClass() {
        withUpdateableCustomObject(customObject -> {
            Foo foo = new Foo(Arrays.asList(new Bar(1, "World's End"), new Bar(2, "Winchester")));

            CustomObjectDraft customObjectDraft = CustomObjectDraft.builder()
                    .key(customObject.getKey())
                    .container(customObject.getContainer())
                    .value(foo)
                    .build();

            GenericCustomObject<Foo> typeRefCustomObject = CommercetoolsTestUtils.getProjectApiRoot()
                    .customObjects()
                    .post(customObjectDraft)
                    .executeBlocking(new TypeReference<GenericCustomObject<Foo>>() {
                    })
                    .getBody();

            Assertions.assertNotNull(typeRefCustomObject);
            Assertions.assertEquals(typeRefCustomObject.getValue().getBars().get(0).getName(), "World's End");
            Assertions.assertEquals(typeRefCustomObject.getValue().getBars().get(0).getNumber(), 1);
            Assertions.assertEquals(typeRefCustomObject.getValue().getBars().get(1).getName(), "Winchester");
            Assertions.assertEquals(typeRefCustomObject.getValue().getBars().get(1).getNumber(), 2);

            JavaType javaType = TypeFactory.defaultInstance()
                    .constructParametricType(GenericCustomObject.class, Foo.class);
            GenericCustomObject<Foo> javaTypeCustomObject = (GenericCustomObject<Foo>) CommercetoolsTestUtils
                    .getProjectApiRoot()
                    .customObjects()
                    .post(customObjectDraft)
                    .executeBlocking(javaType)
                    .getBody();

            Assertions.assertNotNull(javaTypeCustomObject);
            Assertions.assertEquals(javaTypeCustomObject.getValue().getBars().get(0).getName(), "World's End");
            Assertions.assertEquals(javaTypeCustomObject.getValue().getBars().get(0).getNumber(), 1);
            Assertions.assertEquals(javaTypeCustomObject.getValue().getBars().get(1).getName(), "Winchester");
            Assertions.assertEquals(javaTypeCustomObject.getValue().getBars().get(1).getNumber(), 2);

            return customObject;
        });
    }

    @Test
    public void query() {
        withCustomObject(customObject -> {
            CustomObjectPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .customObjects()
                    .get()
                    .withWhere("id=" + "\"" + customObject.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), customObject.getId());
        });
    }

    public static class Foo {
        @JsonProperty("bars")
        private List<Bar> bars;

        public Foo() {
        }

        public Foo(List<Bar> bars) {
            this.bars = bars;
        }

        public List<Bar> getBars() {
            return bars;
        }

        public void setBars(List<Bar> bars) {
            this.bars = bars;
        }
    }

    public static class Bar {
        @JsonProperty("number")
        private Integer number;
        @JsonProperty("name")
        private String name;

        public Bar() {
        }

        public Bar(Integer number, String name) {
            this.number = number;
            this.name = name;
        }

        public Integer getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
