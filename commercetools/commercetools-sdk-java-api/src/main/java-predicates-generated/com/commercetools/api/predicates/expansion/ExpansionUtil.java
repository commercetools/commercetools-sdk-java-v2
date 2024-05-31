
package com.commercetools.api.predicates.expansion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpansionUtil {

    public static <T> List<T> appendOne(final List<T> list, T element) {
        final List<T> arr = new ArrayList(list);
        arr.add(element);
        return Collections.unmodifiableList(arr);
    }
}
