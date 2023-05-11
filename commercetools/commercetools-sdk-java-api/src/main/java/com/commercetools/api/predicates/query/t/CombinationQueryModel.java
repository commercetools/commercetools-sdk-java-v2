
package com.commercetools.api.predicates.query.t;

//public class CombinationQueryModel<T extends Predicate> implements Predicate {
//
////    private final Predicate left;
////    private final BiFunction<Predicate, PredicateBuilder<Predicate>, T> modelFn;
////
////    public CombinationQueryModel(Predicate left, BiFunction<Predicate, PredicateBuilder<Predicate>, T> modelFn) {
////        this.left = left;
////        this.modelFn = modelFn;
////    }
//
////    public T and() {
////        T model = modelFn.apply(left, new PredicateBuilder().left(left).operator("and"));
////        BinaryPredicateBuilder b = BinaryPredicateBuilder.of().left(left).operator("and");
////        //        create.buildFn(predicate -> b.right(predicate).build());
////
////        return create.build();
////        //        return createFn.apply(left);
////        //        return right.apply(new CombinationQueryModel<>(left, right, new BinaryPredicate(left, fn.apply(right.get()), "and")));
////    }
////    public T and(Function<T, Predicate> fn) {
////        T model = create.build();
////        BinaryPredicateBuilder b = BinaryPredicateBuilder.of().left(left).right(fn.apply(model)).operator("and");
////        //        create.buildFn(predicate -> b.right(predicate).build());
////        return
////        return create.build();
////        //        return createFn.apply(left);
////        //        return right.apply(new CombinationQueryModel<>(left, right, new BinaryPredicate(left, fn.apply(right.get()), "and")));
////    }
////
////    public T or() {
////        BinaryPredicateBuilder b = BinaryPredicateBuilder.of().left(left).operator("or");
////        return null;
////        //        return create.apply(b);
////        //        return null; // new CombinationQueryModel<>(left, right, new BinaryPredicate(left.getPredicate(), fn.apply(right), "or"));
////    }
//
//    @Override
////    public String render() {
////        return left.render();
////    }
//}
