package org.triplea.lobby.server.db;

/** Data access object for the users table. */
public interface UserDao {

  /** Returns null if the user does not exist. */
  HashedPassword getPassword(String username);

  /** Returns null if the user does not exist or the user has no legacy password stored. */
  HashedPassword getLegacyPassword(String username);

  boolean doesUserExist(String username);

  void updateUser(String name, String email, HashedPassword password);

  void createUser(String name, String email, HashedPassword password);

  boolean login(String username, HashedPassword password);

  String getUserEmailByName(String username);

  boolean isAdmin(String username);
}
