// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.firebase.firestore.local;

import androidx.annotation.Nullable;

/** Provides methods to save and read Firestore bundles. */
public interface BundleCache {
  /**
   * Gets the saved metadata for a given bundle id. Returns {@code null} if no bundles are found
   * under the given id.
   */
  @Nullable
  BundleMetadata getBundleMetadata(String bundleId);

  /** Saves the metadata from a bundle into local storage, using its id as the persistent key. */
  void saveBundleMetadata(BundleMetadata metadata);

  /**
   * Gets a saved NamedQuery for the given query name. Returns {@code null} if no queries are found
   * under the given name.
   */
  @Nullable
  NamedQuery getNamedQuery(String queryName);

  /** Saves a NamedQuery from a bundle, using its name as the persistent key. */
  void saveNamedQuery(NamedQuery query);
}