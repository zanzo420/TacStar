EventBusEvent
==============
The following shows what Arguments the different events of the EventBus have.

UNIT_BUFF_APPLIED
-----------------
Is invoked if a buff is applied to a Unit.

Arg1: The buff that has been applied.

Arg2: The source of the buff.

Arg3: The target of the buff.

UNIT_BUFF_FADED
-----------------
Is invoked if a buff is faded from a Unit.

Arg1: The buff that has faded.

Arg2: The source of the buff.

Arg3: The target of the buff.

UNIT_BUFF_DISPELLED
-----------------
Is invoked if a buff is dispelled from a Unit.

Arg1: The buff that has been dispelled.

Arg2: The source of the buff.

Arg3: The target of the buff.

UNIT_BUFF_REMOVED
-----------------
Is invoked if a buff is removed from a Unit.

Arg1: The buff that has been removed.

Arg2: The source of the buff.

Arg3: The target of the buff.

UNIT_DEBUFF_APPLIED
-----------------
Is invoked if a debuff is applied to a Unit.

Arg1: The debuff that has been applied.

Arg2: The source of the debuff.

Arg3: The target of the debuff.

UNIT_DEBUFF_FADED
-----------------
Is invoked if a debuff is faded from a Unit.

Arg1: The debuff that has faded.

Arg2: The source of the debuff.

Arg3: The target of the debuff.

UNIT_DEBUFF_DISPELLED
-----------------
Is invoked if a debuff is dispelled from a Unit.

Arg1: The debuff that has been dispelled.

Arg2: The source of the debuff.

Arg3: The target of the debuff.

UNIT_DEBUFF_REMOVED
-----------------
Is invoked if a debuff is removed from a Unit.

Arg1: The debuff that has been removed.

Arg2: The source of the debuff.

Arg3: The target of the debuff.

UNIT_RESOURCE_MAXVALUE_CHANGED
-----------------
Is invoked if the Resourcecap of a Unit changed.

Arg1: The effected Unit.

Arg2: The resource of the Unit.

Arg3: The difference to before.

UNIT_RESOURCE_CURRENTVALUE_CHANGED
-----------------
Is invoked if the currentResourceValue of a Unit changed.

Arg1: The effected Unit.

Arg2: The resource of the Unit.

Arg3: The difference to before.

UNIT_ABILITY_ADDED
-----------------
Is invoked if you try to add a ability to a unit.

Arg1: True if added.

Arg2: The Ability.

UNIT_ABILITY_REMOVED
-----------------
Is invoked if you try to remove a ability from a unit.

Arg1: True if removed.

Arg2: The Ability.

UNIT_STAT_CHANGED
-----------------
Is invoked if a stat of a unit changes.

Arg1: The effected Unit.

Arg2: The Stat.

Arg3: The Difference.

UNIT_GEAR_CHANGED
-----------------
Is invoked if a GearSlot of a GearSet changed.

Arg1: The effected Unit.

Arg2: The GearSlot.

Arg3: The Gear.

UNIT_STATUS_ADDED
-----------------
Is invoked if a UnitStatus is added to a Unit.

Arg1: The effected Unit.

Arg2: The UnitStatus.

UNIT_STATUS_REMOVED
-----------------
Is invoked if a UnitStatus is removed from Unit.

Arg1: The effected Unit.

Arg2: The UnitStatus.