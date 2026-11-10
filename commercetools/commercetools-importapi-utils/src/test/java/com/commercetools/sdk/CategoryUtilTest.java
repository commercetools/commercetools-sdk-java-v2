
package com.commercetools.sdk;

import static com.commercetools.sdk.TestUtils.stringFromResource;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryImpl;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Test;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.json.JsonMapper;

public class CategoryUtilTest {
    String categoryProjectionExample = "src/test/resources/category.example.json";
    private final ObjectMapper objectMapper = new JsonMapper();
    CategoryUtil util = new CategoryUtil();

    @Test
    void shouldDeserializeCategoryCorrectly() throws Exception {
        var testCategory = JsonUtils.fromJsonString(stringFromResource(categoryProjectionExample), Category.class);

        assertNotNull(testCategory, "The category object should not be null.");
        assertInstanceOf(CategoryImpl.class, testCategory,
            "The category should be an instance of Category based on the annotation.");
    }

    @Test
    void shouldMapRequiredFields() {
        var category = JsonUtils.fromJsonString(stringFromResource(categoryProjectionExample), Category.class);
        var result = util.toCategoryImport(category);

        assertEquals("category-key", result.getKey());
        assertEquals("My Category", result.getName().values().get("en"));
        assertEquals("my-category", result.getSlug().values().get("en"));
    }

    @Test
    void shouldMapParentKeyFromExpandedObj() {
        var category = JsonUtils.fromJsonString(stringFromResource(categoryProjectionExample), Category.class);
        var result = util.toCategoryImport(category);

        assertNotNull(result.getParent());
        assertEquals("parent-key", result.getParent().getKey()); // key, not UUID
    }

    @Test
    void shouldMapExternalId() {
        var category = JsonUtils.fromJsonString(stringFromResource(categoryProjectionExample), Category.class);
        var result = util.toCategoryImport(category);
        assertEquals("ext-001", result.getExternalId()); // catches the getId() bug
    }

    @Test
    void shouldHandleNullParent() {
        // fixture without parent field
        var category = JsonUtils.fromJsonString(stringFromResource("src/test/resources/category.no-parent.json"),
            Category.class);
        var result = util.toCategoryImport(category);
        assertNull(result.getParent());
    }

    @Test
    void shouldHandleNullCustom() {
        var category = JsonUtils.fromJsonString(stringFromResource(categoryProjectionExample), Category.class);
        assertDoesNotThrow(() -> util.toCategoryImport(category)); // no NPE when custom is absent
    }
}
