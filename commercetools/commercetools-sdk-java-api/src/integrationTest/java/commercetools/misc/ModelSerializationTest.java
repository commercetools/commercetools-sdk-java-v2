
package commercetools.misc;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.commercetools.api.models.category.*;
import com.commercetools.api.models.common.*;
import com.commercetools.api.models.type.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.Assert;
import org.junit.Test;

public class ModelSerializationTest {

    @Test
    public void serializeCategoryDraftToJson() {
        LocalizedString localizedString = new LocalizedStringImpl();
        localizedString.setValue("test-key", "test-value");
        String key = "test-key";
        String id = "test-id";
        String testString = "test-string";

        Map<String, Object> fieldContainerValues = new HashMap<>();
        fieldContainerValues.put(key, JsonUtils.getConfiguredObjectMapper().createObjectNode().put("val", testString));
        FieldContainer fieldContainer = FieldContainerBuilder.of().values(fieldContainerValues).build();

        AssetDraft assetDraft = AssetDraftBuilder.of().description(localizedString).key(key).name(
            localizedString).custom(
                CustomFieldsDraftBuilder.of().fields(fieldContainer).type(
                    TypeResourceIdentifierBuilder.of().key("string type").build()).build()).sources(
                        Arrays.asList(AssetSourceBuilder.of().contentType("application/json").dimensions(
                            AssetDimensionsBuilder.of().h(10).w(5).build()).build())).tags(
                                Arrays.asList("tag 1", "tag 2")).build();

        CategoryDraft categoryDraft = CategoryDraftBuilder.of().parent(
            CategoryResourceIdentifierBuilder.of().id(id).key(key).build()).assets(Arrays.asList(assetDraft)).custom(
                CustomFieldsDraftBuilder.of().type(
                    TypeResourceIdentifierBuilder.of().key("string type").build()).fields(
                        fieldContainer).build()).description(localizedString).externalId(id).key(key).metaDescription(
                            localizedString).metaKeywords(localizedString).metaTitle(localizedString).name(
                                localizedString).orderHint(testString).slug(localizedString).build();

        JsonElement categoryDraftJson = null;
        try {
            categoryDraftJson = JsonParser.parseString(JsonUtils.toJsonString(categoryDraft));
        }
        catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        try {
            final URL url = Thread.currentThread().getContextClassLoader().getResource(
                "json_examples/category-draft-example.json");
            JsonElement categoryDraftExample = JsonParser.parseString(
                new String(Files.readAllBytes(Paths.get(url.getPath()))));
            Assert.assertEquals(categoryDraftExample, categoryDraftJson);
        }
        catch (IOException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void serializeProductDraftToJson() {

    }

    @Test
    public void deserializeCategoryFromJson() {
        LocalizedString localizedString = new LocalizedStringImpl();
        localizedString.setValue("test-key", "test-value");
        String key = "test-key";
        String id = "test-id";
        String testString = "test-string";

        Map<String, Object> fieldContainerValues = new HashMap<>();
        fieldContainerValues.put(key, JsonUtils.getConfiguredObjectMapper().createObjectNode().put("val", testString));
        FieldContainer fieldContainer = FieldContainerBuilder.of().values(fieldContainerValues).build();

        CustomFields customFields = CustomFieldsBuilder.of().fields(fieldContainer).type(
            TypeReferenceBuilder.of().id(id).build()).build();

        Asset asset = AssetBuilder.of().custom(customFields).description(localizedString).id(id).key(key).name(
            localizedString).sources(
                Arrays.asList(AssetSourceBuilder.of().contentType("application/json").dimensions(
                    AssetDimensionsBuilder.of().h(10).w(5).build()).build())).tags(
                        Arrays.asList("tag 1", "tag 2")).build();

        CategoryReference reference = CategoryReferenceBuilder.of().id(id).build();

        Category category = CategoryBuilder.of().key(key).id(id).ancestors(Arrays.asList(reference)).assets(
            Arrays.asList(asset)).custom(customFields).description(localizedString).externalId(id).metaDescription(
                localizedString).metaKeywords(localizedString).metaTitle(localizedString).name(
                    localizedString).orderHint(testString).parent(reference).slug(localizedString).createdAt(
                        ZonedDateTime.of(2019, 12, 12, 12, 12, 12, 12,
                            ZoneId.ofOffset("UTC", ZoneOffset.ofHours(1)))).build();

        try {
            final URL url = Thread.currentThread().getContextClassLoader().getResource(
                "json_examples/category-example.json");
            String categoryExampleJsonString = new String(Files.readAllBytes(Paths.get(url.getPath())));
            Category exampleCategory = JsonUtils.fromJsonString(categoryExampleJsonString, Category.class);
            Assert.assertEquals(JsonParser.parseString(JsonUtils.toJsonString(exampleCategory)),
                JsonParser.parseString(JsonUtils.toJsonString(category)));
        }
        catch (IOException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void deserializeProductFromJson() throws Exception {

    }
}
