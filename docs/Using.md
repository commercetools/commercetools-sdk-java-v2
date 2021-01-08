# Using SDK

SDK follows a builder pattern when creating requests and model entities. Category resource will be used to demonstrate how to use the SDK. This behaviour is the same for all resources.

```java
class Main {
    public void main() {
        // Create CategoryDraft using builder pattern
        CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .name(
                    LocalizedStringBuilder.of().addValue("en", "name").build()
                )
                .slug(
                    LocalizedStringBuilder.of().addValue("en", "slug").build()
                )
                .description(
                    LocalizedStringBuilder.of().addValue("en", "description").build()
                )
                .externalId("random-id")
                .key("random-key")
                .metaDescription(
                    LocalizedStringBuilder.of().addValue("en", "metaDescription").build()
                )
                .orderHint("hint")
                .build();

        // Use in the previous step configured ApiRoot instance to send and receive a newly created Category
        Category category = apiRoot.withProjectKey("project-key")
                .categories()
                .post(categoryDraft)
                .executeBlocking()
                .getBody();

        // Get Category by id
        Category queriedCategory = apiRoot.withProjectKey("project-key")
                .categories()
                .withId(category.getId())
                .get()
                .executeBlocking()
                .getBody();

        // Get Category by key
        Category queriedCategoryByKey = apiRoot.withProjectKey("project-key")
                .categories()
                .withKey(category.getKey())
                .get()
                .executeBlocking()
                .getBody();

        // Query Categories
        CategoryPagedQueryResponse response = apiRoot.withProjectKey("project-key")
                .categories()
                .get()
                .withWhere("id=" + "\"" + category.getId() + "\"")
                .executeBlocking().getBody();

        // Delete Category by id
        Long version = 1L;
        Category deletedCategory = apiRoot.withProjectKey("project-key")
                .categories()
                .withId(category.getId())
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        // Update Category
        List<CategoryUpdateAction> updateActions = new ArrayList<>();
        LocalizedString newName = LocalizedString.of();
        newName.setValue("key-Temp", "value-Temp");
        updateActions.add(CategoryChangeNameActionBuilder.of()
                .name(newName)
                .build());

        CategoryUpdate categoryUpdate = CategoryUpdateBuilder.of()
                .version(category.getVersion())
                .actions(updateActions)
                .build();

        Category updatedCategory = apiRoot.withProjectKey("project-key")
                .categories()
                .withId(category.getId())
                .post(categoryUpdate)
                .executeBlocking()
                .getBody();

        // Delete Category by key
        Category deletedCategoryByKey = apiRoot.withProjectKey("project-key")
                .categories()
                .withKey(category.getKey())
                .delete()
                .withVersion(category.getVersion())
                .executeBlocking().getBody();   
    }
}
```
