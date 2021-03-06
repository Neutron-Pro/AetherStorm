/**
 * Copyright 2021 NeutronStars
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.neutronstars.aetherstorm.api.database;

import org.slf4j.Logger;

import java.util.Optional;

public interface Database<T>
{
    Logger getLogger();

    Optional<T> execute(String query, Object... objects);

    void update(String query, Object... objects);

    void connect() throws DatabaseException;

    void disconnect() throws DatabaseException;

    void close(T t);
}