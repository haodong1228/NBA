/*==============================================================*/
/* DBMS name:      MySQL 5.7                                    */
/* Created on:     2019/4/9 10:41:17                            */
/*==============================================================*/


drop table if exists coach;

drop table if exists player;

drop table if exists player_data;

drop table if exists team;

drop table if exists team_data;

drop table if exists user;

/*==============================================================*/
/* Table: coach                                                 */
/*==============================================================*/
create table coach
(
   coach_id             varchar(40),
   team_id              varchar(40),
   name                 varchar(40),
   sex                  varchar(20),
   birth                varchar(20),
   Personal_glory       varchar(500),
   background           varchar(500),
   teaching_score       varchar(500),
   remark1              varchar(40),
   remark2              varchar(40)
);

/*==============================================================*/
/* Table: player                                                */
/*==============================================================*/
create table player
(
   player_id            varchar(40),
   team_id              varchar(40),
   name                 varchar(20),
   weight               varchar(20),
   height               varchar(20),
   birth                varchar(20),
   country              varchar(20),
   contract             varchar(200),
   school               varchar(20),
   salary               varchar(20),
   number               varchar(20),
   location             varchar(10),
   Penalty_shot         varchar(20),
   ps_hit_rate          varchar(20),
   three                varchar(20),
   three_hit_rate       varchar(20),
   shoot                varchar(20),
   shoot_hit_rate       varchar(20),
   time                 varchar(20),
   backboard            varchar(20),
   block_shot           varchar(20),
   steals               varchar(20),
   error                varchar(20),
   break_rules          varchar(20),
   play_round           varchar(20),
   score                varchar(20),
   remark1              varchar(40),
   remark2              varchar(40)

);

/*==============================================================*/
/* Table: player_data                                           */
/*==============================================================*/
create table player_data
(
   data_id              varchar(40),
   player_id            varchar(40),
   date                 varchar(20),
   Opponent             varchar(40),
   play_score           varchar(40),
   time                 varchar(20),
   shoot                varchar(20),
   shoot_hit_rate       varchar(20),
   three                varchar(20),
   three_hit_rate       varchar(20),
   penalty_shot         varchar(20),
   ps_hit_rate          varchar(20),
   backboard            varchar(20),
   assists              varchar(20),
   steals               varchar(20),
   block_shot           varchar(20),
   error                varchar(20),
   break_rules          varchar(20),
   score                varchar(20),
   remark1              varchar(40),
   remark2              varchar(40)

);

/*==============================================================*/
/* Table: team                                                  */
/*==============================================================*/
create table team
(
   team_id              varchar(40),
   team_name            varchar(40),
   into_time            varchar(20),
   home_court           varchar(40),
   url                  varchar(100),
   area                 varchar(40),
   coach_id             varchar(40),
   coach_name           varchar(20),
   background           varchar(500),
   Average_score        varchar(20),
   Average_Assists      varchar(20),
   Average_backboard    varchar(20),
   Average_lose_score   varchar(20),
   Average_error        varchar(20),
   remark1              varchar(40),
   remark2              varchar(40)
   
);

/*==============================================================*/
/* Table: team_data                                             */
/*==============================================================*/
create table team_data
(
   data_id              varchar(40),
   team_id              varchar(40),
   date                 varchar(20),
   Opponent             varchar(40),
   play_score           varchar(40),
   time                 varchar(20),
   shoot                varchar(20),
   shoot_hit_rate       varchar(20),
   three                varchar(20),
   three_hit_rate       varchar(20),
   penalty_shot         varchar(20),
   ps_hit_rate          varchar(20),
   backboard            varchar(20),
   assists              varchar(20),
   steals               varchar(20),
   block_shot           varchar(20),
   error                varchar(20),
   break_rules          varchar(20),
   score                varchar(20),
   remark1              varchar(40),
   remark2              varchar(40)

);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   user_id              varchar(40),
   pwd                  varchar(40),
   code                 varchar(40),
   name                 varchar(40),
   age                  varchar(20),
   sex                  varchar(20),
   email                varchar(40),
   number               varchar(20),
   create_time          varchar(20),
   remark1              varchar(40),
   remark2              varchar(40)

);

