(ns chapter-2.chapter-2-q1-test
  (:require [clojure.test :refer :all]
            [data-structures.linked-list :refer :all]
            [chapter-2.chapter-2-q1 :refer :all]))

;; map lookup

(deftest remove-dupes-map-lookup-test
  (is (lists-eq?
        (create-linked-list 1 2 3)
        (remove-dupes-with-buffer (create-linked-list 1 2 3))))
  (is (lists-eq?
        (create-linked-list 1 2)
        (remove-dupes-with-buffer (create-linked-list 1 1 2))))
  (is (lists-eq?
        (create-linked-list 2)
        (remove-dupes-with-buffer (create-linked-list 2 2))))
  (is (lists-eq?
        (create-linked-list 1 2 3)
        (remove-dupes-with-buffer (create-linked-list 1 2 2 3))))
  (is (lists-eq?
        (create-linked-list 1 2)
        (remove-dupes-with-buffer (create-linked-list 1 2 2))))
  (is (lists-eq?
        (create-linked-list 1 2 3 4)
        (remove-dupes-with-buffer (create-linked-list 1 2 2 3 4 4))))

  )

(deftest remove-dupes-test
  (is (lists-eq?
        (create-linked-list 1 2 3)
        (remove-dupes (create-linked-list 1 2 3))))
  (is (lists-eq?
        (create-linked-list 1 2)
        (remove-dupes (create-linked-list 1 1 2))))
  (is (lists-eq?
        (create-linked-list 2)
        (remove-dupes (create-linked-list 2 2))))
  (is (lists-eq?
        (create-linked-list 1 2 3)
        (remove-dupes (create-linked-list 1 2 2 3))))
  (is (lists-eq?
        (create-linked-list 1 2)
        (remove-dupes (create-linked-list 1 2 2))))
  (is (lists-eq?
        (create-linked-list 1 2 3 4)
        (remove-dupes (create-linked-list 1 2 2 3 4 4))))
  (is (lists-eq?
        (create-linked-list 1 2 4 3)
        (remove-dupes (create-linked-list 1 2 4 3 4 4)))))