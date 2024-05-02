
package com.commercetools.docs.meta;

import com.commercetools.api.models.type.TypeDraft;

/**
 * {@include.toc}
 <h2 id="intro">Introduction</h2>

 <p>Interface to mark objects which can have custom fields, it has nothing to do with CustomObjects.</p>

 <p>To use custom fields of a Custom resource it is necessary to connect them to an existing Type, Types define the field names and types like String, MonetaryAmount and Long.</p>

 <p>In the example scenario we create a type for categories.</p>
 <p>The example type will contain:</p>

 <ul>
 <li>an enum field "state" to indicate the state of of the category like "published" and "draft"</li>
 <li>a String field "imageUrl" to show an icon for the category</li>
 <li>a set field with category references "relatedCategories" to suggest other categories with accessoires for example</li>
 </ul>
 <p>If you work with types it is a good idea to import io.sphere.sdk.types.*; so you don't get confused with classes from product attributes which have sometimes the same class name but are in another package.</p>

 <h3 id="create-type">Create a type</h3>

 <p>A type can be assigned to different kinds of objects, e.g., a type can be used for categories, orders and carts. In
 the type creation the property {@link TypeDraft#getResourceTypeIds()} contains a set of resourceTypeIds.</p>

 {@include.example example.CustomFieldsDemo}

 <h3 id="create-object-with-type">Assign a type to an object at the creation of the object</h3>

 {@include.example example.CreateCategoryWithTypeDemo}


 */
public class CustomFieldsDocumentation {
}
